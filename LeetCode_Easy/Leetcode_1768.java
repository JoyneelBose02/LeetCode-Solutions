//Leetcode 1768
//Merge Strings Alternately
class Solution {
    public String mergeAlternately(String w1, String w2) {
        int w1_count = w1.length();
        int w2_count = w2.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<=100;i++){
            if(w1_count<= 0 && w2_count <= 0){
                break;
            }
            else if(w1_count == 0){
                sb.append(w2.charAt(i));
                w2_count -= 1;
            }
            else if(w2_count == 0){
                sb.append(w1.charAt(i));
                w1_count -= 1;
            }
            else{
                sb.append(w1.charAt(i));
                sb.append(w2.charAt(i));
                w1_count--;
                w2_count--;
            }
        }
        return (sb.toString());
    }
}