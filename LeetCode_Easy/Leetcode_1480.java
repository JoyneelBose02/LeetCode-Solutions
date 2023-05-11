//LeetCode 1480
//Running Sum of 1d array

class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int a = 0;
        for(int i =0; i<len;i++){
            a+=nums[i];
            ans[i] = a;
        }
        return ans;
    }
}