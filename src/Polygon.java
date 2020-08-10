import java.util.HashSet;
import java.util.Set;

public class Polygon {
    private Set<Edge> edges = new HashSet<>();

    public Polygon() {
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }

    public void removeEdge(Edge edge) {
        edges.remove(edge);
    }
}
