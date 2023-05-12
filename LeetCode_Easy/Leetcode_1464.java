//Leetcode 1464
//Maximum Product of Two Elements in an Array
class Solution {
    public int maxProduct(int[] nums) {
        int num = 0;
        int pro = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(i==j){
                    continue;
                }
                else{
                    pro = (nums[i]-1)*(nums[j]-1);
                    if(num<pro){
                        num = pro;
                    }
                }
            }
        }
        return num;
    }
}