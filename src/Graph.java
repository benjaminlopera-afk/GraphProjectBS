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
}