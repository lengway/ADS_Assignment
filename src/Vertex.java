import java.util.*;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;
    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        if (adjacentVertices == null) {
            adjacentVertices = new HashMap<>();
        }
        adjacentVertices.put(destination, weight);
    }
    public Vertex(V data) {
        this.data = data;
    }

    public V getData() {
        return data;
    }

    public void setData(V data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Vertex{" + "data=" + data + '}';
    }
}