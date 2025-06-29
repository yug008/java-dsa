import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a graph including vertices and their connected vertices using a HASHMAP
        Map<String, List<String>> graph = new HashMap<>();       //stores vertex/node as a key and its connected vertices/nodes of string datatype as list of strings as the valuetype
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D", "E"));
        graph.put("C", Arrays.asList("A", "F", "G"));
        graph.put("D", Arrays.asList("B"));
        graph.put("E", Arrays.asList("B"));
        graph.put("F", Arrays.asList("C"));
        graph.put("G", Arrays.asList("C"));

        Main.bfs(graph,"A");
    }

        public static void bfs(Map<String,List<String>>graph, String start){
        Queue<String>queue = new LinkedList<>();            //used to store nodes which are to be visited later
        Set<String>visited = new HashSet<>();               //used to store nodes which are already visited

        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){
            String current = queue.poll();
            System.out.println(current + " ");

            for(String neighbour: graph.get(current)){
                if(!visited.contains(neighbour)){
                    queue.add(neighbour);
                    visited.add(neighbour);
                }
            }
        }
        }
    }

    /* 'graph.get(current)' will give a list of the neighbouring vertices of the vertex 'current'. Technically,
    .get() is used to get the respective values for the key used within the () for a map. If there are multiple
    neighbouring vertices for the current node/vertex then the for loop will take one value at a time.Thus,
    one value at a time will be stored in the variable 'neighbour'.

    Then, in the if condition, if the 'visited' hashset doesnt contain the neighbouring vertex. then we will
    store it in queue to be visited next and also store it in hashset at the same time. The reason why we
    store the neighbouring vertex in hashset also even though it is only needed to be stored in queue for
    to be visited later/next is because if some other node points to the vertex then we dont have to add it again.

    We will start bfs by adding the starting vertex in both queue and hashset. Then we will remove and retrieve
    the vertex present in quqeue and store it in a variable and print it using while loop. Then we will store
    the neighbouring vertices of it in a variable of for-loop (if there are multiple vertices then for loop
    will store them one at a time). Then if the variable containing a value isnt visited yet/isnt present in
    the hashset, then we will add it to both queue and hashset
     */
