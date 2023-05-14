//Leetcode 1859
//Sorting The Sentence
import java.util.*;
class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,String> map = new HashMap<>();
        for(int i = 1; i<=9;i++){
            list.add(i);
        }
        int len = s.length();
        int i = 0;
        while(len>0){
            if(list.contains((int)s.charAt(i)-48)){
                map.put((int)s.charAt(i)-48,sb.toString());
                sb.setLength(0);
                len--;
                i++;
            }
            else if(s.charAt(i)==' '){
                sb.setLength(0);
                len--;
                i++;
            }
            else{
                sb.append(s.charAt(i));
                len--;
                i++;
            }
        }
        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            sb.append(map.get(key) + " ");
        }
        System.out.print(map);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
