//Leetcode 2482
//Difference between ones and zeros in row and coloum
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] onesrow = new int[m];
        int[] onescol = new int[n];
        int[] zerosrow = new int[m];
        int[] zeroscol = new int[n];
        for(int i = 0; i<grid.length; i++){
            int onesro = 0;
            int zeroesro = 0;
            for(int j = 0; j<grid[i].length;j++){
                if(grid[i][j] == 1){
                    onesro+=1;
                }
                else{
                    zeroesro+=1;
                }
            }
            onesrow[i] = onesro;
            zerosrow[i] = zeroesro;
        }
        for(int j = 0; j<n;j++){
            int onesco = 0;
            int zeroesco = 0;
            for(int i = 0; i<m; i++){
                if(grid[i][j] == 1){
                    onesco +=1;
                }
                else{
                    zeroesco +=1;
                }
            }
            onescol[j] = onesco;
            zeroscol[j] = zeroesco;
        }
        int[][] diff = new int[m][n];
        for(int i = 0; i<diff.length; i++){
            for(int j = 0; j<diff[i].length;j++){
                diff[i][j] = onesrow[i] + onescol[j] - zerosrow[i] - zeroscol[j];
            }
        }
        return diff;
    }
}