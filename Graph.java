import java.util.*;
class Graph {
    private Map<String, List<String>> adjList = new HashMap<>();

    public void addVertex(String label) {
        adjList.putIfAbsent(label, new ArrayList<>());
    }
    public void addEdge(String v1, String v2) {
        addVertex(v1);
        addVertex(v2);
        adjList.get(v1).add(v2);
        adjList.get(v2).add(v1); // For undirected graph
    }
    public void printGraph() {
        for (String vertex : adjList.keySet()) {
            System.out.print(vertex + " -> ");
            for (String neighbor : adjList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    public void bfs(String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.print(current + " ");
            for (String neighbor : adjList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
    public void dfs(String start) {
        Set<String> visited = new HashSet<>();
        dfsHelper(start, visited);
    }
    private void dfsHelper(String current, Set<String> visited) {
        visited.add(current);
        System.out.print(current + " ");
        for (String neighbor : adjList.get(current)) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }
}
public class GraphApp {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        graph.addEdge("D", "E");
        System.out.println("Graph:");
        graph.printGraph();
        System.out.println("\nBFS Traversal from A:");
        graph.bfs("A");
        System.out.println("\nDFS Traversal from A:");
        graph.dfs("A");
    }
}
