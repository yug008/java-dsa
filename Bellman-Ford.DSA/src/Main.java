public class Main {
    public static void Bellman(int[][]graph, int source){
        int n = graph.length;
        int[]distance = new int [n];

        //Step-1: Initialize distances
        for(int i = 0; i<n; i++){
            distance[i] = Integer.MAX_VALUE;
        }
        distance[source] = 0;

        //Step-2.Full edge Relaxation
        for(int i = 0; i<n-1; i++){
            for(int u = 0; u<n; u++){
                for(int v = 0; v<n; v++){
                    if(distance[u]!=Integer.MAX_VALUE && graph[u][v]!=0 && distance[u]+graph[u][v] < distance[v]){
                        distance[v] = distance[u] + graph[u][v];
                    }
                }
            }
        }
        //Step-3. Detecting negative weight cycles
        for(int u = 0; u<n; u++){
            for(int v = 0; v<n; v++){
                if(distance[u]!=Integer.MAX_VALUE && graph[u][v]!=0 && distance[u]+graph[u][v]<distance[v]){
                    System.out.println("Graph contains a negative weight cycle");
                    return;
                }
            }
        }
        Main.printDistances(distance, source);
    }
    public static void printDistances(int[]distance, int source){
        System.out.println("Vertex \tDistance from source " + source);
        for(int i = 0; i<distance.length; i++){
            System.out.println(i + "\t\t" + distance[i]);
        }
    }

    public static void main(String[] args) {
        int [][] graph = {  {0, 10, 0, 0, 5},
                {0, 0, 1, 0, 2},
                {0, 0, 0, 4, 0},
                {7, 0, 6, 0, 0},
                {0, 3, 9, 2, 0}

        };
Main.Bellman(graph, 0);
    }
}

/* if a negative weight cycle is detected, then it will return / the method will be terminated due to the
return statement. As bellman ford doesnt handle negative weight cycles.
 */