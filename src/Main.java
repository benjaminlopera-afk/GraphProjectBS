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

        if (graph.isTree()) {
            System.out.println("Es un árbol");
        } else {
            System.out.println("No es un árbol");
        }

        if (graph.isForest()) {
            System.out.println("Es un bosque");
        } else {
            System.out.println("No es un bosque");
        }

        if (graph.hasEulerPath()) {
            System.out.println("Tiene camino de Euler");
        } else {
            System.out.println("No tiene camino de Euler");
        }

        if (graph.hasEulerCircuit()) {
            System.out.println("Tiene circuito de Euler");
        } else {
            System.out.println("No tiene circuito de Euler");
        }
        
        System.out.println("\n--- Grafo de prueba 1 (árbol) ---");
        Graph graph1 = new Graph();
        graph1.addEdge(0, 1, 1);
        graph1.addEdge(1, 2, 1);
        graph1.addEdge(2, 3, 1);

        System.out.println(graph1.isTree()         ? "Es un árbol"            : "No es un árbol");
        System.out.println(graph1.isForest()       ? "Es un bosque"           : "No es un bosque");
        System.out.println(graph1.hasEulerPath()   ? "Tiene camino de Euler"  : "No tiene camino de Euler");
        System.out.println(graph1.hasEulerCircuit()? "Tiene circuito de Euler": "No tiene circuito de Euler");

        System.out.println("\n--- Grafo de prueba 2 (ciclo) ---");
        Graph graph2 = new Graph();
        graph2.addEdge(0, 1, 1);
        graph2.addEdge(1, 0, 1);
        graph2.addEdge(1, 2, 1);
        graph2.addEdge(2, 1, 1);
        graph2.addEdge(2, 0, 1);
        graph2.addEdge(0, 2, 1);

        System.out.println(graph2.isTree()         ? "Es un árbol"            : "No es un árbol");
        System.out.println(graph2.isForest()       ? "Es un bosque"           : "No es un bosque");
        System.out.println(graph2.hasEulerPath()   ? "Tiene camino de Euler"  : "No tiene camino de Euler");
        System.out.println(graph2.hasEulerCircuit()? "Tiene circuito de Euler": "No tiene circuito de Euler");
    }
}