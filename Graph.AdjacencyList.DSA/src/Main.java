import java.util.ArrayList;
import java.util.Scanner;

class Graph{
    ArrayList<ArrayList<Integer>>adjList = new ArrayList<>();

    public Graph(int vertices){                       //parameterized constructor
        for(int i = 0; i<=vertices; i++){             //let the graph start from 1, so we will create (vertices+1) empty lists and add them in adjList(outer list)
            adjList.add(new ArrayList<Integer>());      //creates empty list and adds it to the outer list 'adjList'
        }
    }
    public void add(int source, int designation){          //source->vertex , designation->neighbour
        adjList.get(source).add(designation);
        adjList.get(designation).add(source);
    }
    public void show(){
        for (int i = 1; i < adjList.size(); i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}


public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of vertices: ");
        int vertices = sc.nextInt();

        Graph obj = new Graph(vertices);

        System.out.println("Enter total number of edges: ");
        int edges = sc.nextInt();

        for(int i = 0; i<edges; i++){
            System.out.println("Enter vertex: ");
            int vertex = sc.nextInt();
            System.out.println("Enter neighbour: ");
            int neighbour = sc.nextInt();

            obj.add(vertex,neighbour);
        }

        obj.show();
    }
}