import java.util.*;

public class BreadthFirstSearch<Vertex> extends Search<Vertex> {
    private final WeightedGraph<Vertex> graph;

    public BreadthFirstSearch(WeightedGraph<Vertex> graph, Vertex source) {
        super(source);
        this.graph = graph;
        BFSearch();
    }

    public void BFSearch() {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(source);
        marked.add(source);

        while (!queue.isEmpty()) {
            Vertex v = queue.poll();
            for (Edge<Vertex> e : graph.map.get(v)) {
                Vertex w = e.getDest();
                if (!marked.contains(w)) {
                    marked.add(w);
                    edgeTo.put(w, v);
                    queue.add(w);
                }
            }
        }

    }

}
