public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();

        FileManager.loadGraphFromFile("graph.txt", graph);

//        graph.addEdge(0, 1, 5);
//        graph.addEdge(0, 2, 3);
//        graph.addEdge(1, 2, 1);

        graph.printGraph();
    }
}