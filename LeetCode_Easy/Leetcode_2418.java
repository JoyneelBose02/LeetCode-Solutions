//Leetcode 2418 
//Sort the people
import java.util.*;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map= new HashMap<>();
        int k=0;
        for(int height: heights){
            map.put(height, names[k]);
            k++;
        }
        Arrays.sort(heights);
        String[] res=new String[names.length];
        int j=0;
        for(int i=heights.length-1;i>=0;i--){

            res[j]= map.get(heights[i]);
            j++;
        }
        return res;
    }
}