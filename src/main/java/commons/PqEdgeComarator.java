package commons;

import java.util.Comparator;

public class PqEdgeComarator implements Comparator<PqEdge> {
    @Override
    public int compare(PqEdge x, PqEdge y) {
        if (x.getWeight() < y.getWeight()) {
            return -1;
        }
        if (x.getWeight() > y.getWeight()) {
            return 1;
        }
        return 0;
    }
}
