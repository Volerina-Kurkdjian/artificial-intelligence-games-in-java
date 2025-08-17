package dfs.wordsearch;

public class SolutionWordSearch {

    //Given an m x n grid of characters board and a string word, return true if word exists in the grid.
    //The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring.
    // The same letter cell may not be used more than once.


    //Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
    //Output: true
    //n = board[i].length
    //1 <= m, n <= 6
    //1 <= word.length <= 15


    public  boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board,String word, int i, int j, int index){
        int m = board.length;
        int n = board[0].length;

        if(index==word.length())return true;

        if(i<0 || i>= m || j<0 || j>=n || board[i][j]!=word.charAt(index)){
            return false;
        }

        char temp=board[i][j];//backtracking
        board[i][j]='#';

        boolean found=dfs(board, word, i+1,j,index+1)||
                dfs(board,word,i-1,j,index+1) ||
                dfs(board,word,i,j+1,index+1) ||
                dfs(board,word,i,j-1,index+1);

        board[i][j]=temp;//backtracking
        return found;
    }


}
