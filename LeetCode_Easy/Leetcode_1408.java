//Leetcode 1408
//String Matching in an array
import java.util.*;
class Solution {
    public List<String> stringMatching(String[] words) {
        HashSet<String> str = new HashSet<String>();

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(i != j){
                    if(words[i].contains(words[j])){
                        str.add(words[j]);
                    }
                }
            }
        }

        List<String> res = new ArrayList<String>(str);

        return res;
    }
}