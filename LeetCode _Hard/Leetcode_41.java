//Leetcode 41
//First Missing Positive
import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i  : nums){
            set.add(i);
        }
        int j = 1;
        while(true){
            if(!set.contains(j)){
                return j;
            }
            j++;
        }
    }
}

