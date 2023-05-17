//Leetcode 557
//Reverse words in a string
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                sb.reverse();
                list.add(sb.toString());
                sb.setLength(0);
            }
            else if(i == s.length()-1){
                sb.append(s.charAt(i));
                sb.reverse();
                list.add(sb.toString());
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        sb.setLength(0);
        for(int i = 0; i<list.size();i++){
            sb.append(list.get(i) + ' ');
        }
        sb.deleteCharAt(sb.length()-1);
        
        System.out.print(list);
        return sb.toString();
    }
}