package com.graphs;

import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.graph.Node;
import org.graphstream.graph.Edge;

public class App {
    public static void main(String[] args) {

        SingleGraph graph = new SingleGraph("graph");

        Node A = graph.addNode("A");
        Node B = graph.addNode("B");
        Node C = graph.addNode("C");
        Node D = graph.addNode("D");

        Edge AB = graph.addEdge("AB", A, B);
        Edge BC = graph.addEdge("BC", B, C);
        Edge CD = graph.addEdge("CD", C, D);
        Edge DA = graph.addEdge("DA", D, A);

        graph.display(true);
    }
}
