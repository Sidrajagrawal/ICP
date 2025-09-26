import java.util.*;
public class Minimum_Time_to_Complete_Trips{
    class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long lo = 1;
        long minTime = Long.MAX_VALUE;
        for (int t : time) {
            minTime = Math.min(minTime, t);
        }
        long hi = minTime * (long) totalTrips;
        long res = hi;
        
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (isPossible(time, mid, totalTrips)) {
                res = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return res;
    }

    private boolean isPossible(int[] arr, long k, int total) {
        long trips = 0;
        for (int ele : arr) {
            trips += k / ele;  
            if (trips >= total) return true; 
        }
        return trips >= total;
    }
}

}