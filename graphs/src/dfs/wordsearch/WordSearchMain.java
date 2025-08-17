package dfs.wordsearch;

public class WordSearchMain {

    public static void main(String[] args) {
        // Sample board
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        SolutionWordSearch solutionWordSearch=new SolutionWordSearch();

        // Sample words to test
        String word1 = "ABCCED"; // should return true
        String word2 = "SEE";    // should return true
        String word3 = "ABCB";   // should return false

        // Run tests
        System.out.println("Word \"" + word1 + "\" exists: " + solutionWordSearch.exist(board, word1));
        System.out.println("Word \"" + word2 + "\" exists: " + solutionWordSearch.exist(board, word2));
        System.out.println("Word \"" + word3 + "\" exists: " + solutionWordSearch.exist(board, word3));
    }
}
