package nl.badmuts.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Edge> edges = new ArrayList<>();

    public void addEdge(Edge e) {
        edges.add(e);
    }

    public void print() {
        for (Edge e: edges) {
            System.out.println(e);
        }
    }

}
