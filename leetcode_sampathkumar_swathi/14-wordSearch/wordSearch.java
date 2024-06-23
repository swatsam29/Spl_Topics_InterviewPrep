//Depth-first search algorithm to find words
class Solution {
    public boolean exist(char[][] board, String word) {
       
        for (int i = 0; i < board.length; ++i) //words are found in the board
            for (int j = 0; j < board[0].length; ++j)
                if (dfs(board, word, i, j, 0))
                return true;

        return false;//words are not found in the board
    }

  private boolean dfs(char[][] board, String word, int i, int j, int s) {

   
    if (i < 0 || i == board.length || j < 0 || j == board[0].length || 
        board[i][j] != word.charAt(s) || board[i][j] == '*'){//check indices are out of bound and character doesnot match
        return false;
    }


    if (s == word.length() - 1){ //entire word is found
      return true;
    }

    final char cache = board[i][j]; //mark the cells and check the adj cell for next character 
    board[i][j] = '*';

    final boolean isExist = dfs(board, word, i + 1, j, s + 1) || 
                            dfs(board, word, i - 1, j, s + 1) || 
                            dfs(board, word, i, j + 1, s + 1) || 
                            dfs(board, word, i, j - 1, s + 1);
    board[i][j] = cache;

    return isExist;
  }
}

// Example 1:
// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
// Output: true

// Example 2:
// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
// Output: true

// Example 3:
// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
// Output: false
