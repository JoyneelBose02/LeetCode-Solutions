//Leetcode 1561
//Maximum number of coins that you can get
import java.util.*;
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int k=0;
        int sum=0;
        int idx= piles.length-2;
        while(k!= ((piles.length)/3) ){
            sum=sum+piles[idx];
            idx=idx-2;
            k++;
        }
     return sum;
    }
}