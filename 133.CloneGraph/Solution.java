import java.util.HashMap;
import java.util.Map;

/**
 * 解题思路：
 * DFS遍历。
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return null;
        Map<Integer, UndirectedGraphNode> visited = new HashMap<>();
        return dfs(node, visited);
    }

    private UndirectedGraphNode dfs(UndirectedGraphNode node, Map<Integer, UndirectedGraphNode> marks) {
        UndirectedGraphNode graph = new UndirectedGraphNode(node.label);
        marks.put(graph.label, graph);

        for (UndirectedGraphNode n : node.neighbors) {
            if (marks.containsKey(n.label)) {
                graph.neighbors.add(marks.get(n.label));
            } else {
                graph.neighbors.add(dfs(n, marks));
            }
        }
        return graph;
    }
}
