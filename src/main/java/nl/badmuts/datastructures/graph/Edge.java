package nl.badmuts.datastructures.graph;

public class Edge {
    private Vertex v1;
    private Vertex v2;
    private int value;

    public Edge(Vertex v1, Vertex v2, int value) {
        this.v1 = v1;
        this.v2 = v2;
        this.value = value;
    }

    @Override public String toString() {
        return v1.getLabel() + " - " + v2.getLabel() + " value: " + value;
    }
}
