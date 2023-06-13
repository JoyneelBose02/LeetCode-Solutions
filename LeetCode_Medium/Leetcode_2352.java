//Leetcode 2352
//Equal Row and Column Pairs
import java.util.*;
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;
        int[][] col = new int[n][n];
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                col[i][j] = grid[j][i];
            }
        }
        System.out.println(Arrays.deepToString(col));
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                if(Arrays.equals(grid[i],col[j])){
                    count++;
                }
            }
        }
        return count;
    }
}
