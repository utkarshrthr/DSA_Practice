package com.utkarshrathore.app.hd.dsa._012_graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _001_Path {

    public static void main(String[] args) {
        int A = 5;
        List<List<Integer>> data = List.of(
                List.of(1, 2), List.of(4, 1), List.of(2, 4), List.of(3, 4), List.of(5, 2), List.of(1, 3)
        );
        solution(A, data);
    }

    static int solution(int A, List<List<Integer>> edges) { // T.C -> O(V+E), S.C. =>
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<A;i++){
            graph.add(new ArrayList<>());
        }
        for(List<Integer> edge: edges){
            int u = edge.get(0);
            int v = edge.get(1);
            graph.get(u-1).add(v-1);
        }
        int st = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[A];
        q.add(st);
        visited[st] = true;
        while(!q.isEmpty()){
            int top = q.poll();
            if(top == A-1)
                return 1;
            for(int neighbor: graph.get(top)){
                if(!visited[neighbor]){
                    q.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        return 0;
    }
}
