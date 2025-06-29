import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pair {
    int designation;
    int weight;

    public Pair(int designation, int weight) {
        this.designation = designation;
        this.weight = weight;
    }
}

class Graph {
    Map<Integer, List<Pair>> adjList = new HashMap<>();        //here adjlist is a hashmap! not an arraylist!

    public Graph(int vertices) {
        for (int i = 0; i <= vertices; i++) {
            adjList.put(i, new ArrayList<>());
        }
    }

    public void add(int source, int destination, int weight) {
        adjList.get(source).add(new Pair(destination, weight));
        adjList.get(destination).add(new Pair(source, weight));
    }

    public void show() {
        for (int i = 1; i < adjList.size(); i++) {
            System.out.print(i + " -> ");
            for (Pair neighbor : adjList.get(i)) {
                System.out.print("(" + neighbor.designation + ", " + neighbor.weight + ") ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total vertices: ");
        int vertices = sc.nextInt();
        Graph obj = new Graph(vertices);

        System.out.print("Enter total number of edges: ");
        int edges = sc.nextInt();
        for (int i = 0; i < edges; i++) {
            System.out.println("Edge " + (i + 1));
            System.out.print("Enter vertex: ");
            int source = sc.nextInt();
            System.out.print("Enter neighbouring vertex: ");
            int neighbour = sc.nextInt();
            System.out.print("Enter the weight of respective edge: ");
            int weight = sc.nextInt();
            obj.add(source, neighbour, weight);
        }
        obj.show();
    }
}

