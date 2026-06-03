import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {

    public static void loadGraphFromFile(
            String path,
            Graph graph
    ) {

        try {

            File file = new File(path);

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                if (line.startsWith("source")) continue;

                String[] parts = line.split(",");

                int source = Integer.parseInt(parts[0]);
                int target = Integer.parseInt(parts[1]);
                int weight = Integer.parseInt(parts[2]);

                graph.addEdge(source, target, weight);
            }

            scanner.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found.");
        }
    }
}