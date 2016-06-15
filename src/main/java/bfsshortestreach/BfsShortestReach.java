package bfsshortestreach;

import commons.Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class BfsShortestReach {
    public static void main(String args[]) {

        Graph graph = new Graph(5);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(1, 4);
        graph.addEdge(1, 4);
        graph.addEdge(1, 2);
        graph.printMatrix();
        getShortestDistances(4, graph);
    }

    public static int[] getShortestDistances(int startVertex, Graph graph) {
        int[] distances = new int[graph.getVertices()];
        for(int i = 0; i< graph.getVertices(); i++) {
            distances[i] = -1;
        }
        ArrayList<Integer> queue = new ArrayList<Integer>();
        boolean visited[] = new boolean[graph.getVertices()];
        distances[startVertex] = 0;
        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.println(queue);
        while(!queue.isEmpty()) {
            int vertex = queue.get(0);
            queue.remove(0);
            for(int i = 0; i < graph.getVertices(); i++) {
                if(graph.edgeExists(vertex, i) && !visited[i]) {
                    System.out.println("adding the vertex " + i);
                    queue.add(i);
                    visited[i] = true;
                    System.out.println(queue);
                    if(distances[i] == -1) {
                        distances[i] = distances[vertex] + 6;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(distances));

        for(int i = 0; i < graph.getVertices(); i++) {
            if(i != startVertex) {
                System.out.print(distances[i] + " ");
            }
        }
        return distances;
    }

}
