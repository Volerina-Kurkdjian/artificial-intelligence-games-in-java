import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> adjacencyList;

    public Vertex(String name) {
        this.name = name;
        this.adjacencyList=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }


    public void addNeighbor(Vertex vertex){
        this.adjacencyList.add(vertex);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
