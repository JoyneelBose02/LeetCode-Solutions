//Leetcode 1684
//Count Number of Consistent Strings
import java.util.*;
class Solution {
    
    public int countConsistentStrings(String allowed, String[] words) {
      int count=0;
      for(int i=0;i<words.length;i++)
      {
          if(hashfun(words[i],allowed))
            count++;
      }  
      return count;
    }
    static boolean hashfun(String s,String a){
    HashMap<Character,Integer> hs = new HashMap();
     for(char i:s.toCharArray()){
         hs.put(i,hs.getOrDefault(i,0)+1);     
        }
        int sum=0;
        for(char c: a.toCharArray())
        {
            if(hs.containsKey(c))
            {
                sum+=hs.get(c);
            }
        }
        if(sum!=s.length())
            return false;
        return true;
      
    

    }
}