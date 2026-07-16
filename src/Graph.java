import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Graph {

    HashMap<Integer, ArrayList<Edge>> adjacencyList;

    public Graph() {

        adjacencyList = new HashMap<>();
    }

    public void addEdge(int source, int target, int weight) {

        adjacencyList.putIfAbsent(source, new ArrayList<>());
        adjacencyList.putIfAbsent(target, new ArrayList<>());

        adjacencyList.get(source).add(
                new Edge(target, weight)
        );
    }

    public void printGraph() {

        for (int source : adjacencyList.keySet()) {
            System.out.print(source + " -> ");

            for (Edge edge : adjacencyList.get(source)) {
                System.out.print("(" + edge.target + ", " + edge.weight + ") ");
            }

            System.out.println();
        }

    }

    public int getDegree(int vertex) {

        if (!adjacencyList.containsKey(vertex)) {
            return 0;
        }

        return adjacencyList.get(vertex).size();
    }

    public boolean isMultigraph() {

        for (int source : adjacencyList.keySet()) {

            ArrayList<Edge> edges = adjacencyList.get(source);

            for (int i = 0; i < edges.size(); i++) {

                Edge current = edges.get(i);

                if (source == current.target) {
                    return true;
                }

                for (int j = i + 1; j < edges.size(); j++) {

                    if (current.target == edges.get(j).target) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean isComplete() {

        int totalVertices = adjacencyList.size();

        for (int source : adjacencyList.keySet()) {

            ArrayList<Edge> edges = adjacencyList.get(source);

            if (edges.size() != totalVertices - 1) {
                return false;
            }
        }

        return true;
    }

    private void dfs(int vertex, HashSet<Integer> visited) {
        visited.add(vertex);
        for (Edge edge : adjacencyList.get(vertex)) {
            if (!visited.contains(edge.target)) {
                dfs(edge.target, visited);
            }
        }
    }

    public boolean isTree() {
        // Contar total de aristas
        int totalEdges = 0;
        for (int source : adjacencyList.keySet()) {
            totalEdges += adjacencyList.get(source).size();
        }

        // Un árbol tiene exactamente n-1 aristas
        int totalVertices = adjacencyList.size();
        if (totalEdges != totalVertices - 1) {
            return false;
        }

        // Verificar conexidad con DFS
        int startVertex = adjacencyList.keySet().iterator().next();
        HashSet<Integer> visited = new HashSet<>();
        dfs(startVertex, visited);

        return visited.size() == totalVertices;
    }

}

