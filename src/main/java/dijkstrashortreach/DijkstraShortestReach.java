package dijkstrashortreach;


import commons.PqEdge;
import commons.Graph;
import commons.PqEdgeComarator;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;


public class DijkstraShortestReach {
    public static void main(String[] args) throws URISyntaxException, FileNotFoundException {

        Graph graph = new Graph(5);
        graph.addEdge(1, 2, 24);
        graph.addEdge(1, 4, 20);
        graph.addEdge(1, 3, 3);
        graph.addEdge(4, 3, 12);
        getShortestDistances(1, graph);
    }

    public static int[] getShortestDistances(int startVertex, Graph graph) {
        int[] distances = new int[graph.getVertices()];
        for(int i = 0; i< graph.getVertices(); i++) {
            distances[i] = -1;
        }
        PriorityQueue<PqEdge> priorityQueue = new PriorityQueue<PqEdge>(graph.getVertices(), new PqEdgeComarator());
        boolean visited[] = new boolean[graph.getVertices()];
        distances[startVertex] = 0;
        visited[startVertex] = true;
        priorityQueue.add(new PqEdge(startVertex, 0));

        while(!priorityQueue.isEmpty()) {
            PqEdge currentPqEdge = priorityQueue.poll();
            int vertex = currentPqEdge.getVertex();
            for(int i = 0; i < graph.getVertices(); i++) {

                if(graph.edgeExists(vertex, i)) {
                    int newDistance = distances[vertex] + graph.getEdgeWeight(i, vertex);
                    if(!visited[i]) {
                        priorityQueue.add(new PqEdge(i, graph.getEdgeWeight(i, vertex)));
                        visited[i] = true;
                    }
                    if(distances[i] == -1 || distances[i] > newDistance) {
                        distances[i] = newDistance;
                        updatePriorityQueue(priorityQueue, i, newDistance);
                    }
                }
            }
        }
        System.out.println(Arrays.toString(distances));

        for(int i = 1; i < graph.getVertices(); i++) {
            if(i != startVertex) {
                System.out.print(distances[i] + " ");
            }
        }
        return distances;
    }

    private static void updatePriorityQueue (PriorityQueue<PqEdge> priorityQueue, int vertex, int distance){
        Iterator<PqEdge> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            PqEdge pqEdge = iterator.next();
            if( pqEdge.getVertex() == vertex) {
                priorityQueue.remove(pqEdge);
                priorityQueue.add(new PqEdge(vertex, distance));
                break;
            }
        }

    }
    /*public static void runTestCaseFromFile

    {
     File file = new File(DijkstraShortestReach.class.getClassLoader().getResource("DijkstraShortestReach.txt").toURI());
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int noOfTestCases = Integer.parseInt(br.readLine());
            System.out.println("===============> total " + noOfTestCases);
            for (int i = 0; i < 5; i++) {
                System.out.println("===============> case " + i);
                String vertext_edges_line = br.readLine();
                String[] vertext_edge = vertext_edges_line.split(" ");
                int np_of_vertex = Integer.parseInt(vertext_edge[0]);
                System.out.println("===============> no of vertex  " + np_of_vertex);
                int np_of_edges = Integer.parseInt(vertext_edge[1]);
                System.out.println("===============> no of edges " + np_of_edges);
                Graph graph = new Graph(np_of_vertex + 1);
                for(int j = 0; j < np_of_edges; j++) {
                    String[] edge_line = br.readLine().split(" ");
                    graph.addEdge(Integer.parseInt(edge_line[0]), Integer.parseInt(edge_line[1]), Integer.parseInt(edge_line[2]));
                }
                int start_vertex = Integer.parseInt(br.readLine());
                System.out.println("===============> start vertex " + start_vertex);
                if( i > 3) {
                    graph.printMatrix();
                    getShortestDistances(start_vertex, graph);
                }
                System.out.println("");
                System.out.println("===============> End of Case " + i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

}
