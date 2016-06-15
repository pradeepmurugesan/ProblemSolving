package bfsshortestreach;

import commons.Graph;
import org.junit.Assert;
import org.junit.Test;

public class BfsShortestReachTest {
    @Test
    public void testBfsShortestReach() {
        int[] expected = {12, 6, 12, 6, 0};
        Graph graph = new Graph(5);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(1, 4);
        graph.addEdge(1, 4);
        graph.addEdge(1, 2);
        graph.printMatrix();
        int[] distances = BfsShortestReach.getShortestDistances(4, graph);
        Assert.assertEquals(expected[0], distances[0]);
        Assert.assertEquals(expected[2], distances[2]);
        Assert.assertEquals(expected[3], distances[3]);
    }
}
