public class Main {

    public static void dijkstra(int[][]graph, int source) {
        int n = graph.length;
        int[] distance = new int[n];                   //stores shortest distance of each vertex from source
        boolean[] visited = new boolean[n];            //stores visited nodes (true or false)

        //Step-1: Initialize distances
        for (int i = 0; i < n; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[source] = 0;

        //Step-2: Find the shortest path for all vertices
        for (int i = 0; i < n - 1; i++) {                            //(n-1) times because we aren't considering the source vertex
            int u = Main.minDistance(distance, visited, n);
            visited[u] = true;

            //Step-3: Update distances to neighbours/ relaxation of neighbours
            for (int v = 0; v < n; v++) {
                if (distance[u]!=Integer.MAX_VALUE && !visited[v] && graph[u][v]!=0 && distance[u] + graph[u][v] < distance[v]){
                        distance[v] = distance[u] + graph[u][v];
                }
            }
        }
        Main.printDistances(distance,source);
    }
    public static int minDistance(int[]distance, boolean[]visited, int n){
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int v =0; v<n; v++){
            if(!visited[v] && distance[v]<min){
                min = distance[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
    public static void printDistances(int[]distance, int source){
        System.out.println("Vertex \t Distance from Source " + source);
        for (int i = 0; i < distance.length; i++) {
            System.out.println(i + " \t\t " + distance[i]);
        }
    }

    public static void main(String[] args) {
int [][] graph = {  {0, 10, 0, 0, 5},
        {0, 0, 1, 0, 2},
        {0, 0, 0, 4, 0},
        {7, 0, 6, 0, 0},
        {0, 3, 9, 2, 0}

};
      Main.dijkstra(graph,0);
    }
}

// Integer.MAX_VALUE ---> Its the maximum integer value / Infinity