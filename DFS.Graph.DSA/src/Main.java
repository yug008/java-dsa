import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Main {
   static Map<String, List<String>> graph = new HashMap<>();
    static Set<String> visited = new HashSet<>();
    public static void main(String[] args) {
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "C"));
        graph.put("C", Arrays.asList("A", "B", "D"));
        graph.put("D", Arrays.asList("C", "E", "F"));
        graph.put("E", Arrays.asList("D", "F"));
        graph.put("F", Arrays.asList("D", "E"));

        Main.dfs("A");
    }

    public static void dfs(String start) {
        if (visited.contains(start)) {                 //base case
            return;
        }
        visited.add(start);
        System.out.println(start);
        for(String neighbour : graph.get(start)){
            if(!visited.contains(neighbour)){
                dfs(neighbour);                            //recursively call dfs using neighbour
            }
        }
    }
}