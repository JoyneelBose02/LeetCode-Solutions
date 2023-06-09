//Leetcode 744
//Find smallest letter greater than target
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int a = 123;
        int count = 0;
        for(int i = 0; i<letters.length;i++){
            if((int)letters[i]>(int)target){
                a = Math.min(a,(int)letters[i]);
            }
            else{
                count++;
            }
        }
        if(count == letters.length){
            return letters[0]; 
        }
        else{
            return (char)a;
        }
    }
}
