package pekan9_2511533018;

import pekan8_2511533018.Utils.Utils;
import pekan9_2511533018.helper.StringUtils;

import java.util.*;

public class GraphTraversal_2511533018 {
    private final Map<String, List<String>> graph_3018 = new HashMap<>();

    // menambahkab edge (graf tak berarah)
    public void addEdge_2511533018(String node1_3018, String node2_3018) {
        graph_3018.putIfAbsent(node1_3018, new ArrayList<>());
        graph_3018.putIfAbsent(node2_3018, new ArrayList<>());
        graph_3018.get(node1_3018).add(node2_3018);
        graph_3018.get(node2_3018).add(node1_3018);
    }

    // menampilkan graf awal
    public void printGraph_2511533018() {
        Utils.printLineStatement("Graf awal (Adjacency List: ");
        for (String node_3018 : graph_3018.keySet()) {
            Utils.printStatement(node_3018 + " -> ");
            List<String> neighbors_3018 = graph_3018.get(node_3018);
            Utils.printLineStatement(String.join(", ", neighbors_3018));
        }
        Utils.printLineStatement();
    }

    // DFS rekursif
    public void dfs_2511533018(String start_3018) {
        Set<String> visited_3018 = new HashSet<>();
        Utils.printStatement("Penelusuran DFS: ");
        dfsHelper_2511533018(start_3018, visited_3018);
        Utils.printLineStatement();
    }

    private void dfsHelper_2511533018(String current_3018, Set<String> visited_3018) {
        if (visited_3018.contains(current_3018)) return;
        visited_3018.add(current_3018);

        Utils.printStatement(current_3018 + StringUtils.empty());
        for (String neighbor : graph_3018.getOrDefault(current_3018, new ArrayList<>())) {
            dfsHelper_2511533018(neighbor, visited_3018);
        }
    }

    public void bfs_2511533018(String start_3018) {
        Set<String> visited_3018 = new HashSet<>();
        Queue<String> queue_3018 = new LinkedList<>();

        queue_3018.add(start_3018);
        visited_3018.add(start_3018);

        Utils.printStatement("Penelusuran BFS: ");
        while (!queue_3018.isEmpty()) {
            String current_3018 = queue_3018.poll();
            Utils.printStatement(current_3018 + StringUtils.empty());
            for (String neighbor : graph_3018.getOrDefault(current_3018, new ArrayList<>())) {
                if (!visited_3018.contains(neighbor)) {
                    queue_3018.add(neighbor);
                    visited_3018.add(neighbor);
                }
            }
        }
        Utils.printLineStatement();
    }

    public static void main(String[] args) {
        GraphTraversal_2511533018 graph_3018 = new GraphTraversal_2511533018();

        // contoh graf: A-B, A-C, B-D, B-E
        graph_3018.addEdge_2511533018("A", "B");
        graph_3018.addEdge_2511533018("A", "C");
        graph_3018.addEdge_2511533018("B", "D");
        graph_3018.addEdge_2511533018("B", "E");

        Utils.printLineStatement("Graf awal adalah: ");
        graph_3018.printGraph_2511533018();

        graph_3018.dfs_2511533018("A");
        graph_3018.bfs_2511533018("A");
    }
}
