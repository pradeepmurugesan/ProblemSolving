package commons;

public class PqEdge {

    int vertex;
    int weight;

    public PqEdge(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }


    public int getVertex() {
        return vertex;
    }

    public void setVertex(int vertex) {
        this.vertex = vertex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
