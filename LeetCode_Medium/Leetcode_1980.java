//Leetcode 1980
//Find Unique Binary String
import java.util.*;
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        solve(sb,list,nums[0].length());
        for(int i = 0; i<nums.length; i++){
            if(list.contains(nums[i])){
                list.remove(nums[i]);
            }
        }
        return list.get(0);
    }
    public void solve(StringBuilder sb, ArrayList<String> list,int length){
        if(length == 0){
            list.add(sb.toString());
            return;
        }
        sb.append('1');
        solve(sb,list,length-1);
        sb.deleteCharAt(sb.length()-1);
        sb.append('0');
        solve(sb,list,length-1);
        sb.deleteCharAt(sb.length()-1);
    }
}
