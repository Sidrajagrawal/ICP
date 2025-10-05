import java.util.*;
public class Maximum_Subarray{
    class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int ele: nums){
            curr_sum +=ele;
            max_sum = Math.max(curr_sum,max_sum);
            if(curr_sum <0) curr_sum=0;
        }
        return max_sum;
    }
}
}
