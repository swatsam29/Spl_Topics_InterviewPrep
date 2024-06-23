class Solution {
    private Set<Integer> col = new HashSet<Integer>();
   private Set<Integer> diag1 = new HashSet<Integer>();
   private Set<Integer> diag2 = new HashSet<Integer>();
   
   public List<List<String>> solveNQueens(int n) {
       List<List<String>> res = new ArrayList<List<String>>();//store the solution
       dfs(res,new ArrayList<String>(), 0, n);// depth-first search algorithm with backtracking is used
       return result;
   }
   private void dfs(List<List<String>> result, List<String> list, int row, int n){
       if (row == n){ //all N queens are placed
           result.add(new ArrayList<String>(list));//add the current solution to the list 
           return;
       }
       for (int i = 0; i < n; i++){
           if (col.contains(i) || 
           diag1.contains(row + i) || 
           diag2.contains(row - i)) 
           
           continue;//skips and moves to the next iteration
           
           char[] charArray = new char[n];//creating array char 
           Arrays.fill(charArray, '.');//insert . in the row
           charArray[i] = 'Q'; //place the queen
           String rowString = new String(charArray);// converting the array to a sting
           
           list.add(rowString); //add the current row-- mark the col, diagonal1, diagonal2
           col.add(i);
           diag1.add(row + i);
           diag2.add(row - i);
           
           dfs(result, list, row + 1, n); //recurse to next row
           
           list.remove(list.size() - 1); //remove the current row-- unmark the col, diagonal1, diagonal2
           col.remove(i);
           diag1.remove(row + i);
           diag2.remove(row - i);
       }
   }
}
