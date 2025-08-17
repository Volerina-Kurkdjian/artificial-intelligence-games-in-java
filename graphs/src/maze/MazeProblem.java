package maze;

public class MazeProblem {

    //Implement an algorithm that can find the way out of a maze.
    //
    //[
    //[1,1,1,1,1],
    //[1,2,0,1,1],
    //[1,1,0,1,1],
    //[1,1,0,0,0],
    //[1,1,1,1,3],
    //]
    //So we have a map like this
    //
    //integer 1 represents walls
    //
    //integer 2 is the starting point
    //
    //integer 3 is the destination (so this is what we are looking for)
    //
    //integer 0 represents the states we can consider (so the solution contains one or more 0 states)
    //
    //So the solution should be something like this (S represents the states in the solution set):
    //
    //[
    //[-,-,-,-,-],
    //[-,2,S,-,-],
    //[-,-,S,-,-],
    //[-,-,S,S,S],
    //[-,-,-,-,3],
    //]


   private int[][] maze;
   private boolean[][] visited;
   private int startRow;
   private int startCol;

   public MazeProblem(int[][] maze,int startRow, int startCol){
       this.maze=maze;
       this.visited=new boolean[maze.length][maze.length];
       this.startRow=startRow;
       this.startCol=startCol;
   }

   public void findWay(){
       if(dfs(startRow,startCol)){
           System.out.println("Solution exists!");
       }
       else System.out.println("No solution!");
   }

   private boolean isFeasible(int x, int y){

       //vertical dimension check
       if(x<0|| x>maze.length-1){
            return false;
       }

       //horizontal dimension check
       if(y<0 || y>maze.length-1){
            return false;
       }

       //already considered this state
       if(visited[x][y]){
           return false;
       }

       //this is an obstacle in the way
       if(maze[x][y]==1){
           return false;
       }

       return true;
   }

   private boolean dfs(int x, int y){

       //base case
       if(x== maze.length-1 && y==maze.length-1){
           return true;
       }

       if(isFeasible(x,y)){
           visited[x][y]=true;

           //visit the next cells

           //go down
           if(dfs(x+1,y)){
               return true;
           }
           //go up
           if(dfs(x-1,y)){
               return true;
           }

           //go left
           if(dfs(x,y+1)){
               return true;
           }
           //go right
           if(dfs(x,y-1)){
               return true;
           }

           //BACKTRACK
           visited[x][y]=false;
           return false;
       }
       return true;

   }



}
