import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public void traverse(Vertex root){
        Queue<Vertex> queue=new LinkedList<>();

        root.setVisited(true);
        queue.add(root);

        
    }
}
