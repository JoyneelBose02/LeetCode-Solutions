//Leetcode 151
//Reverse Words in a String
import java.util.*;
class Solution {
    public String reverseWords(String result) {
        String s = result.replaceAll("\\s+", " ").trim();
        s.trim();
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == ' '){
                list.add(sb.toString());
                sb = new StringBuilder();
            }
            else if(i == s.length()-1){
                sb.append(s.charAt(i));
                list.add(sb.toString());
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        StringBuffer st = new StringBuffer();
        for(int i = list.size()-1; i>=0; i--){
            if(i==0){
                st.append(list.get(i));
            }
            else{
                st.append(list.get(i));
                st.append(' ');
            }
        }
        return (st.toString());
    }
}