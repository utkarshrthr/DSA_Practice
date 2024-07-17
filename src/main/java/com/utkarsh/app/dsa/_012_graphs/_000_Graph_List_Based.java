package com.utkarshrathore.app.hd.dsa._012_graphs;

import java.util.ArrayList;
import java.util.List;

public class _000_Graph_List_Based {
    public static void main(String[] args) {
        int vertices = 5;
        int[][] edges = {
                {1, 2}, {4, 1}, {2, 4}, {3, 4}, {5, 2}, {1, 3}
        };
        Graph graph = new Graph(vertices);
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            graph.edges.get(u-1).add(v-1);
        }
        for (int i=0;i<vertices;i++){
            System.out.println((i+1) +" -> " + join(graph.edges.get(i)));
        }
    }

    static String join(List<Integer> l){
        StringBuilder sb = new StringBuilder();
        for(int i: l){
            sb.append(i+1).append(" ");
        }
        return sb.toString();
    }

    static class Graph {
        int vertices;
        ArrayList<ArrayList<Integer>> edges;

        Graph(int vertices){
            this.vertices = vertices;
            this.edges = new ArrayList<>();
            for(int i=0;i<vertices;i++){
                this.edges.add(new ArrayList<>());
            }
        }
    }
}
