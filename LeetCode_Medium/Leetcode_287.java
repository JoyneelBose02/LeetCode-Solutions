//Leetcode 287
//Find the duplicate number
import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int c : nums){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }
            else{
                map.put(c,1);
            }
        }
        for(Map.Entry entry : map.entrySet()){
            if((int)entry.getValue()>=2){
                return (int)entry.getKey();
            }
        }
        return 0;
        
    }
}
