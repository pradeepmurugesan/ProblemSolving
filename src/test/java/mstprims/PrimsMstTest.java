package mstprims;

import commons.Graph;
import matchtheshoes.MatchTheShoes;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PrimsMstTest {
    @Test
    public void simpleTest() {
        Graph graph = new Graph(6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 4);
        graph.addEdge(4, 2, 6);
        graph.addEdge(5, 2, 2);
        graph.addEdge(2, 3, 5);
        graph.addEdge(3, 5, 7);
        int mst = PrimsMst.getmst(1, graph);
        Assert.assertEquals(mst, 15);
    }
}
