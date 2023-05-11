//Leetcode 4
//Median of Two Sorted arrays
import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
		int n = nums2.length;
		
		int[] arr = new int[m+n];
		int len = m+n;
		for(int i = 0; i<m;i++){
		    arr[i] = nums1[i];
		}
		int j =0;
		for(int i = m; i<len; i++){
		    arr[i] = nums2[j];
		    j++;
		}
        Arrays.sort(arr);
        double median = 0;
	    int med = 0;
	    int length = arr.length;
	    for(int i = 0; i<length;i++){
	        if(length%2==0){
	            if(arr[length/2]%2==0 && arr[length/2-1]%2==0){
                    median = (arr[length/2] + arr[(length/2)-1])/2;
                }
                else if((arr[length/2] + arr[length/2-1])%2==0.0){
                    median = (arr[length/2] + arr[(length/2)-1])/2;
                }
                else{
                    median = (arr[length/2] + arr[(length/2)-1])/2 + 0.5;
                }
	        }
	        else{
	            med = arr[length/2];
	        }
	    }
        if(length%2==0){
            return median;
        }
        else{
            return med;
        }
    }
}