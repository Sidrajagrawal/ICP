import java.util.*;
public class Koko_Eating_Bananas{
    class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int ele: piles){
            max =  Math.max(max,ele);
        }
        int s = 1, e= max,res=0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isPossible(mid,piles,h)){
                e = mid-1;
                res=mid;
            }else{
                s = mid+1;
            }
        }
        return res;
    }
    public static boolean isPossible(int k, int[] piles, int h){
        int ans = 0;
        for(int ele:piles){
            ans += ele/k;
            ans += ele%k == 0 ? 0 : 1;
            if(ans > h) return false;
        }
        return ans <= h;
    }
}
} 