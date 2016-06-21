package dijkstrashortestreach;


import static dijkstrashortreach.DijkstraShortestReach.getShortestDistances;

import commons.Graph;
import mstprims.PrimsMst;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DijkstraShortestReachTest {
    @Test
    public void simpleTest() {
        Graph graph = new Graph(5);
        graph.addEdge(1, 2, 24);
        graph.addEdge(1, 4, 20);
        graph.addEdge(1, 3, 3);
        graph.addEdge(4, 3, 12);
        int[] actual = getShortestDistances(1, graph);
        int[] expected = {-1, 0, 24, 3, 15};
        Assert.assertTrue(Arrays.equals(actual, expected));
    }
}
