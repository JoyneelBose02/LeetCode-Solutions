//Leetcode 121
//Best time to Buy and Sell stock
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for(int i : prices){
            min = Math.min(i,min);
            max = Math.max(max,i-min);
        }
        return max;
        
    }
}