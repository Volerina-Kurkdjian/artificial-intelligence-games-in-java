import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public void traverse(Vertex root){
        Queue<Vertex> queue=new LinkedList<>();

        root.setVisited(true);
        queue.add(root);

        while(!queue.isEmpty()){
            Vertex actualvertex=queue.remove();

            for(Vertex v: actualvertex.getAdjacencyList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
