public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();

        FileManager.loadGraphFromFile("graph.txt", graph);

//        graph.addEdge(0, 1, 5);
//        graph.addEdge(0, 2, 3);
//        graph.addEdge(1, 2, 1);

        graph.printGraph();
        System.out.println(
                "Grado del vertice 0: " + graph.getDegree(0)

        );
        System.out.println(
                "Grado del vertice 1: " + graph.getDegree(1)
        );

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