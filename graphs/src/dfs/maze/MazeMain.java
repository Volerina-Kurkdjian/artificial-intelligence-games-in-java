package dfs.maze;

public class MazeMain {

    //Construct an algorithm that can find its way out of an NxN dfs.maze--> reprezent the problem with an NxN matrix
    //How to navigate a robot in the most effective way?
    //autonomous vacuum cleaners --> several obstacles so we can use backtracking or construct the graph and use depth-first search


    //1 approach: if we know the dfs.maze: Dijkstra and A*

    //2 approach: if we don't know the dfs.maze: backtracking (Tremaux algorithms)


    public static void main(String[] args) {
        int[][] map={
                {1,1,1,1,1,1},
                {2,1,0,0,0,1},
                {0,1,0,1,0,0},
                {0,1,0,1,1,0},
                {0,0,0,1,1,3}
        };

        MazeProblem mazeProblem=new MazeProblem(map,1,0);

        mazeProblem.findWay();
    }
}
