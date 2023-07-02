//Leetcode 1551
//Minimum Operations to make an array equal
class Solution {
    public int minOperations(int n) {
        int sum = 0;
        for(int i = 0; i<n;i++){
            int num = (2*i)+1;
            sum += num;
        }
        int mean = sum/n;
        System.out.println(mean);
        int count = 0;
        for(int i = 0; i<n/2;i++){
            count= count + (mean-((2*i)+1));
        }
        return count;

    }
}