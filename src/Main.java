public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();

        FileManager.loadGraphFromFile("graph.txt", graph);

//        graph.addEdge(0, 1, 5);
//        graph.addEdge(0, 2, 3);
//        graph.addEdge(1, 2, 1);

        graph.printGraph();
        for (int vertex : graph.adjacencyList.keySet()) {
            System.out.println("Grado del vertice " + vertex + ": " + graph.getDegree(vertex));
        }

        if(graph.isMultigraph()) {
            System.out.println("Es multigrafo");
        } else {
            System.out.println("Es grafo simple");
        }
        if(graph.isComplete()) {
            System.out.println("Es completo");
        } else {
            System.out.println("No es completo");
        }

    }
}