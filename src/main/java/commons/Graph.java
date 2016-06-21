package commons;

import java.util.List;

public class Graph {
        private int vertices;
        private int[] [] adjMatrix;
        public Graph(int vertices) {
            this.vertices = vertices;
            adjMatrix = new int [vertices] [vertices];
            for(int i = 0; i < vertices; i++) {
                for(int j = 0; j< vertices; j++) {
                    adjMatrix[i][j] = -1;
                }
            }
        }

        public void printMatrix() {
            for(int i = 0; i < vertices; i++) {
                for(int j = 0; j< vertices; j++) {
                    System.out.print(adjMatrix[i][j] + " ");

                }
                System.out.println("");
            }
        }

        public int getVertices() {
            return this.vertices;
        }

        public void addEdge(int source,int destination) {
            adjMatrix[source][destination] = 1;
            adjMatrix[destination][source] = 1;

        }

        public void addEdge(int source,int destination, int weight) {
            if(adjMatrix[source][destination] == -1 || adjMatrix[source][destination] > weight) {
                adjMatrix[source][destination] = weight;
                adjMatrix[destination][source] = weight;
            }

        }

        public boolean edgeExists(int source, int destination) {
            return adjMatrix[source][destination] != -1 ? true : false;
        }

        public int getEdgeWeight(int source, int destination) {
            return adjMatrix[source][destination];
        }
}
