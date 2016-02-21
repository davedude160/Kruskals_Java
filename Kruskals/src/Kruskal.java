import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Kruskal {

	class Edge {
		int firstVertex = 0;
		int secondVertex = 0;
		int weight = 0;
	}

	class Vertex {
		int number;
		List<Edge> edges;

	}

	public static void main(String args[]) throws IOException {

		String fileName = "src/input.txt";
		String fileOutputName = "output.txt";

		try {
			BufferedReader fileReader1 = new BufferedReader(new FileReader(fileName));
			BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName));
			// LineNumberReader lnr = new LineNumberReader(fileReader);

			// int numberOfLines = 0;

			Scanner in = new Scanner(fileReader1.readLine());

			int numberOfVertices = in.nextInt();
			System.out.println(numberOfVertices);

			int numberOfEdges = in.nextInt();
			System.out.println(numberOfEdges);

			Edge[][] graph = new Edge[numberOfVertices][numberOfEdges];

			fileReader2.readLine();
			int i = 0;
			int j = 0;
			while (fileReader1.readLine() != null) {

				graph[i][j].firstVertex = i;
				Scanner scan = new Scanner(fileReader2.readLine());
				while (scan.hasNextInt()) {
					graph[i][j].secondVertex = scan.nextInt();
					graph[i][j].weight = scan.nextInt();
					j++;
				}

				i++;
			}

			for (i = 0; i < graph.length; i++) {
				for (j = 0; j < graph[i].length; j++) {
					System.out.println("Token: " + graph[i][j]);
				}
			}

			// lnr.close();
			fileReader1.close();
			fileReader2.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
