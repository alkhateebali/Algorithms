package com.devbyali.graph;

import java.util.*;

public class Graph {
    private class Node {
        private String lable;

        public Node(String lable) {
            this.lable = lable;
        }

        @Override
        public String toString() {
            return lable;
        }
    }

    private Map<String, Node> vertices;
    private Map<Node, List<Node>> adjacencyMatrix;

    public Graph() {
        vertices = new HashMap<>();
        adjacencyMatrix = new HashMap<>();
    }

    public void addNode(String label) {
        var node = new Node(label);
        adjacencyMatrix.putIfAbsent(node, new ArrayList<>());

    }

    public void addEdge(String from, String to) {
        var fromNode = vertices.get(from);
        var toNode = vertices.get(to);
        if (fromNode == null)
            throw new IllegalArgumentException(from + "doesn't exist");
        if (toNode == null)
            throw new IllegalArgumentException(to + "doesn't exist");
        adjacencyMatrix.get(fromNode).add(toNode); // becuse its a unit directed graph
        // adjacencyMatrix.get(toNode).add(fromNode);  Add this line its a non directed graph
    }

    public void print() {
        for (var source : adjacencyMatrix.keySet()) {
            var targets = adjacencyMatrix.get(source);
            if (!targets.isEmpty())
                System.out.println(source + " is connected to " + targets);
        }
        // A is connected with B and C
        // C is connected with  A
    }

    public void removeNode(String label) {
        var target = vertices.get(label);
        if (target == null) return;
        for (var n : adjacencyMatrix.keySet())
            adjacencyMatrix.get(n).remove(n);
        adjacencyMatrix.remove(target);
        vertices.remove(label);
    }

    public void removeEdge(String from, String to) {
        var fromNode = vertices.get(from);
        var toNode = vertices.get(to);
        if (fromNode == null || toNode == null) return;
        adjacencyMatrix.get(fromNode).remove(toNode);
    }

    public void traverseDepthFirst(String root) {
        if (vertices.get(root) == null) return;
        traverseDepthFirst(vertices.get(root), new HashSet<>());

    }

    private void traverseDepthFirst(Node root, Set<Node> visited) {
        System.out.println(root);
        visited.add(root);
        var list = adjacencyMatrix.get(root);
        for (var node : list) {
            if (!visited.contains(node))
                traverseDepthFirst(node, visited);
        }

    }

    public void traverseBreadthFirst(String root) {
        var node = vertices.get(root);
        if (node == null) return;
        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            var current = queue.remove();
            if (visited.contains(current)) continue;
            System.out.println(current);
            visited.add(current);
            for (var n : adjacencyMatrix.get(current)) {
                if (!visited.contains(n))
                    queue.add(n);
            }
        }
    }
}
