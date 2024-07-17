package com.utkarshrathore.app.hd.dsa._012_graphs;

// Java program to print DFS traversal
// from a given graph

import java.util.Iterator;
import java.util.LinkedList;

// This class represents a
// directed graph using adjacency
// list representation
public class _000_Graph {
    private int V;

    // Array of lists for
    // Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    @SuppressWarnings("unchecked") _000_Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        // Add w to v's list.
        adj[v].add(w);
    }

    // A function used by DFS
    void DFSUtil(int v, boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print((v+1) + " ");

        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // The function to do DFS traversal.
    // It uses recursive DFSUtil()
    void DFS(int v)
    {
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Call the recursive helper
        // function to print DFS
        // traversal
        DFSUtil(v, visited);
    }

    // Driver Code
    public static void main(String args[])
    {
        _000_Graph g = new _000_Graph(5);
//        List.of(1, 2), List.of(4, 1), List.of(2, 4), List.of(3, 4), List.of(5, 2), List.of(1, 3)
//        0 -> 1, 3 -> 0, 1 -> 3, 2 -> 3, 4 -> 1, 0 -> 3
//        0 -> 1, 3 -> 0, 1 -> 3, 2 -> 3, 4 -> 1, 0 -> 3
        g.addEdge(0, 1);
        g.addEdge(3, 0);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(4, 1);
        g.addEdge(0, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        // Function call
        g.DFS(0);
        System.out.println();
        g.DFS(1);
        System.out.println();
        g.DFS(2);
        System.out.println();
        g.DFS(3);
        System.out.println();
        g.DFS(4);
    }
}
// This code is contributed by Aakash Hasija
