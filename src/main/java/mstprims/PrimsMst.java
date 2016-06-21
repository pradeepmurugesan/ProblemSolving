package mstprims;

import commons.Graph;
import commons.PqEdge;
import commons.PqEdgeComarator;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.PriorityQueue;

public class PrimsMst {
    public static void main(String[] args) throws URISyntaxException, FileNotFoundException {

        Graph graph = new Graph(6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 4);
        graph.addEdge(4, 2, 6);
        graph.addEdge(5, 2, 2);
        graph.addEdge(2, 3, 5);
        graph.addEdge(3, 5, 7);
        getmst(1, graph);
    }

    public static int getmst(int startVertex, Graph graph) {

        PriorityQueue<PqEdge> priorityQueue = new PriorityQueue<PqEdge>(graph.getVertices(), new PqEdgeComarator());
        boolean visited[] = new boolean[graph.getVertices()];
        visited[startVertex] = true;
        priorityQueue.add(new PqEdge(startVertex, 0));
        int mstWeight  = 0;

        while(!priorityQueue.isEmpty() && !isAllVisited(visited)) {
            PqEdge currentEdge = priorityQueue.poll();
            int vertex = currentEdge.getVertex();
            if(!visited[vertex]) {
                mstWeight += currentEdge.getWeight();
                visited[vertex] = true;
            }
            for(int i = 0; i < graph.getVertices(); i++) {

                if(graph.edgeExists(vertex, i)) {
                    if(!visited[i]) {
                        priorityQueue.add(new PqEdge(i, graph.getEdgeWeight(i, vertex)));

                    }
                }
            }
        }
        System.out.println(mstWeight);
        return mstWeight;
    }

    public static boolean isAllVisited(boolean[] visited) {
        boolean allVisited = true;
        for(boolean visit : visited) {
            if(!visit) {
                allVisited = false;
                break;
            }
        }
        return allVisited;
    }
}
