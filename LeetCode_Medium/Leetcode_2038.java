//Leetcode 2038
//Remove Colored Pieces if Both Neighbors are the same colors
import java.util.*;
class Solution {
    public boolean winnerOfGame(String colors) {
        int aCount = 0;
        int bCount = 0;
        char curr = 'A';
        int count = 1;
        if(colors.charAt(0) == 'A'){
            curr = 'A';
        }
        else{
            curr = 'B';
        }
        for(int i = 1; i<colors.length(); i++){
            if(colors.charAt(i) == curr){
                count++;
            }
            else{
                if(curr=='A'){
                    if(count>=3){
                        aCount += count - 2;
                    }
                }
                else{
                    if(count>=3){
                        bCount += count -2;
                    }
                }
                count = 1;
                curr = colors.charAt(i);
            }
        }
        if(curr=='A'){
            if(count>=3){
                aCount += count - 2;
            }
        }
        else{
            if(count>=3){
                bCount += count -2;
            }
        }
        if(aCount == bCount){
            return false;
        }
        if(aCount>bCount){
            return true;
        }
        return false;
    }
}