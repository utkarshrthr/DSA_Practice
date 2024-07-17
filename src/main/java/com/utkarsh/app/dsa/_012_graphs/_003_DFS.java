package com.utkarshrathore.app.hd.dsa._012_graphs;

import java.util.ArrayList;
import java.util.List;

public class _003_DFS {

    public static void main(String[] args) {
        int A = 5;
        List<List<Integer>> data = List.of(
                List.of(1, 2), List.of(4, 1), List.of(2, 4), List.of(3, 4), List.of(5, 2), List.of(1, 3)
        );
        dfs(A, data);
    }
    static void dfs(int vertices, List<List<Integer>> edges){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<(vertices+1);i++){
            graph.add(new ArrayList<>());
        }
        for(List<Integer> edge: edges){
            int u = edge.get(0);
            int v = edge.get(1);
            graph.get(u).add(v);
        }
        for(int i=1;i<=5;i++){
            boolean[] visited = new boolean[vertices+1];
            dfs(i, visited, graph);
            System.out.println();
        }
    }

    static void dfs(int val, boolean[] visited, ArrayList<ArrayList<Integer>> graph){
        System.out.print((val)+ " ");
        visited[val] = true;
        ArrayList<Integer> nodes = graph.get(val);
        for(Integer i: nodes){
            if(!visited[i]){
                dfs(i, visited, graph);
            }
        }
    }
}
