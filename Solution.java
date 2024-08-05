public class Solution {
    public static int minFlips(int[][] grid) {
        int a = func1(grid);
        int b = func2(grid);
         int ans = Math.min(a,b);
        return ans;
      }
    public static int func1(int[][] grid){
           int count = 0;
          int l = 0;
          while (l < grid.length) {
              int i = 0;
              int j = grid[i].length-1;
              while (i<j) {
                  if (grid[l][i] != grid[l][j]) {
                      count++;
                  }
  
                  i++;
                  j--;
              }
              l++;
          }
          return count;
      }
        public static int func2(int[][] grid){
           int count = 0;
          int l = 0;
          while (l < grid[0].length) {
              int i = 0;
              int j = grid.length-1;
              while (i<j) {
                  if (grid[i][l] != grid[j][l]) {
                      count++;
                  }
  
                  i++;
                  j--;
              }
              l++;
          }
          return count;
      }
    public static void main(String[] args) {
        int grid[][] = {{1,0},{1,0},{0,0}};  
    System.out.println(minFlips(grid));  }
}