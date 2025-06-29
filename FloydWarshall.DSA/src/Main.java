public class Main {
    final static int INF = 99999;                       //representation of infinity
    public static void floydWarshall(int[][]graph){
        int n = graph.length;
        int[][]distance = new int [n][n];

// Step 1: Initialize the distance matrix with input graph values / copy the graph matrix to distance matrix
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                distance[i][j] = graph[i][j];
            }
        }
        // Step 2: Update distances / values of distance matrix using each vertex as an intermediate vertex (only if the condition is satisfied)
        for(int k = 0; k<n; k++){
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    if(distance[i][k] + distance[k][j] < distance[i][j]){
                        distance[i][j] = distance[i][k] + distance[k][j];
                    }
                }
            }
        }
        // Step 3: Print the final distance matrix
        Main.printDistance(distance);
    }
    public static void printDistance(int[][]distance){
        int n = distance.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(distance[i][j] == INF){
                    System.out.println("INF");
                }
                else{
                    System.out.println(distance[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] graph = {
                {0, 3, INF, 5},
                {2, 0, INF, 4},
                {INF, 1, 0, INF},
                {INF, INF, 2, 0}
        };
        Main.printDistance(graph);
    }
}

/* here, i-> rows and j->columns and k->intermediate vertex.

 */