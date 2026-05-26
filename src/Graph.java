import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    HashMap<Integer, ArrayList<Edge>> adjacencyList;

    public Graph() {

        adjacencyList = new HashMap<>();
    }

    public void addEdge(int source, int target, int weight) {

        adjacencyList.putIfAbsent(source, new ArrayList<>());

        adjacencyList.get(source).add(new Edge(target, weight));
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
}

