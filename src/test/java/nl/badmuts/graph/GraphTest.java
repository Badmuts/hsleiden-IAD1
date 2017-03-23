package nl.badmuts.graph;

import junit.framework.TestCase;
import org.junit.Test;

public class GraphTest extends TestCase {

    private Graph graph;

    public void setUp() {
        graph = new Graph();
        Vertex amsterdam = new Vertex("Amsterdam");
        Vertex haarlem = new Vertex("Haarlem");
        Vertex denhaag = new Vertex("Den Haag");
        Vertex zoetermeer = new Vertex("Zoetermeer");
        Vertex utrecht = new Vertex("Utrecht");
        Vertex hilversum = new Vertex("Hilversum");
        Vertex amersfoort = new Vertex("Amersfoort");
        Vertex barneveld = new Vertex("Barneveld");
        Vertex ede = new Vertex("Ede");
        Vertex kudelstaart = new Vertex("Kudelstaart");
        Vertex leiden = new Vertex("Leiden");
        Vertex rotterdam = new Vertex("Rotterdam");
        Edge e1 = new Edge(amsterdam, leiden, 40);
        Edge e2 = new Edge(amsterdam, haarlem, 20);
        Edge e3 = new Edge(amsterdam, hilversum, 35);
        Edge e4 = new Edge(amsterdam, kudelstaart, 15);
        Edge e5 = new Edge(amsterdam, utrecht, 49);
        Edge e6 = new Edge(leiden, haarlem, 30);
        Edge e7 = new Edge(leiden, denhaag, 15);
        Edge e8 = new Edge(leiden, utrecht, 55);
        Edge e9 = new Edge(leiden, rotterdam, 35);
        Edge e10 = new Edge(leiden, haarlem, 30);
        Edge e11 = new Edge(leiden, amsterdam, 40);
        Edge e12 = new Edge(haarlem, leiden, 30);
        Edge e13 = new Edge(haarlem, amsterdam, 20);
        Edge e14 = new Edge(denhaag, rotterdam, 15);
        Edge e15 = new Edge(denhaag, zoetermeer, 10);
        Edge e16 = new Edge(utrecht, ede, 50);
        Edge e17 = new Edge(utrecht, amersfoort, 26);
        Edge e18 = new Edge(utrecht, amsterdam, 49);
        Edge e19 = new Edge(utrecht, zoetermeer, 56);
        Edge e20 = new Edge(ede, barneveld, 18);
        Edge e21 = new Edge(barneveld, amersfoort, 15);
        Edge e22 = new Edge(amersfoort, hilversum, 25);
        graph.addEdge(e1);
        graph.addEdge(e2);
        graph.addEdge(e3);
        graph.addEdge(e4);
        graph.addEdge(e5);
        graph.addEdge(e6);
        graph.addEdge(e7);
        graph.addEdge(e8);
        graph.addEdge(e9);
        graph.addEdge(e10);
        graph.addEdge(e11);
        graph.addEdge(e12);
        graph.addEdge(e13);
        graph.addEdge(e14);
        graph.addEdge(e15);
        graph.addEdge(e16);
        graph.addEdge(e17);
        graph.addEdge(e18);
        graph.addEdge(e19);
        graph.addEdge(e20);
        graph.addEdge(e21);
        graph.addEdge(e22);
    }

    @Test
    public void testGraph() {
        graph.print();
    }
 }
