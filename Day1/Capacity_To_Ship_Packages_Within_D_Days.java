import java.util.*;
public class Capacity_To_Ship_Packages_Within_D_Days{
    class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0, max = Integer.MIN_VALUE;
        for(int ele: weights){
            sum+=ele;
            max = Math.max(ele,max);
        }
        int s = max;
        int e = sum;
        int res = 0;
        while(s<=e){
            int mid = (s+e)/2;
            if(isPossible(mid,weights,days)){
                e = mid-1;
                res = mid;
            }else{
                s = mid+1;
            }
        }
        return res;
    }
    public static boolean isPossible(int k, int[] weights, int days){
        int cut = 0;
        int sum = 0;
        for(int ele: weights){ 
            if(sum + ele > k){
                cut++;
                sum = ele;
            } else {
                sum += ele;
            }
            if(cut > days) return false;
        }
        return cut<days;
    }
}
}