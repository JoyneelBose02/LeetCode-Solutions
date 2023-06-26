//Leetcode 189
//Rotate array
import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int j = 0;
        int[] new_arr = new int[n];
        for(int i = n-k; i<n;i++){
            new_arr[j] = nums[i];
            j++;
        }
        int t = k;
        for(int i = 0; i<n-k;i++){
            new_arr[t] = nums[i];
            t++;
        }
        for(int i = 0; i<n; i++){
            nums[i] = new_arr[i];
        }
        System.out.println(Arrays.toString(new_arr));
    }
}