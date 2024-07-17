package com.utkarshrathore.app.hd.dsa._012_graphs;

import java.util.ArrayList;
import java.util.List;

public class _005_First_Depth_First_Search {

    public static void main(String[] args) {
        System.out.println(solution(List.of(1,1,1,3,3,2,2,7,6), 2, 8));
        System.out.println(solution(List.of(1, 1, 2), 2, 1));
    }

    static int solution(List<Integer> al, int b, int c){
        int vertices = al.size();
        ArrayList<ArrayList<Integer>> gr = new ArrayList<>();
        for(int i=0; i<vertices+1;i++){
            gr.add(new ArrayList<>());
        }
        for(int i=1;i<=vertices;i++){
            int u = al.get(i-1);
            int v = i;
            gr.get(u).add(v);
        }
        boolean[] visited = new boolean[vertices+1];
        return dfs(b, c, visited, gr);
    }
    static int dfs(int src, int dest, boolean[] visited, ArrayList<ArrayList<Integer>> gr){
        if(src == dest){
            return 1;
        }
        visited[src] = true;
        ArrayList<Integer> nodes = gr.get(src);
        for(int i:nodes){
            if(!visited[i]){
                int val = dfs(i, dest, visited, gr);
                if(val == 1)
                    return 1;
            }
        }
        return 0;
    }
}
