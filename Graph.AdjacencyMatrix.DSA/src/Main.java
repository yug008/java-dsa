import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices: ");
        int vertices = sc.nextInt();

        int [][] adjMatrix = new int [vertices+1][vertices+1];                  //always remember to do +1 in size while creating adjacency matrix

        System.out.println("Enter the number of edges: ");
        int edges = sc.nextInt();

        //Establishing connections (edges) between vertices
        for(int i = 0; i<edges; i++){
            System.out.println("Enter the source vertex: ");
            int from = sc.nextInt();
            System.out.println("Enter the designation vertex: ");
            int to = sc.nextInt();

            adjMatrix[from][to] = 1;                  //as its an undirected matrix
            adjMatrix[to][from] = 1;
        }

        //after connections/edges between vertices is done and a matrix is also created, we will print the matrix
        for(int i = 1; i<=vertices; i++){                           //as we are creating adjacency matrix from verices 1,2,3,... thus we will start loop from 1
            for(int j = 1; j<=vertices; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/* The determination of whether an edge exists(1) or doesnt exist(0) is done using the code in lines 22,23

which is: adjMatrix[from][to] = 1;
          adjMatrix[to][from] = 1;

          this determines whether an edge is present or not. As we are considering undirected graph here so
          edge will exist in both directions from->to and to->from and so both will be 1. For a non undirected
          graph, one of them will be 0 as edge will exist in only one direction.
 */