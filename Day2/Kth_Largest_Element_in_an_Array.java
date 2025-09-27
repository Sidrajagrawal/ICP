import java.util.*;
public class {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
	    	PriorityQueue<Integer> hp = new PriorityQueue<>();
	    	for(int i=0;i<k;i++) {
	    		hp.add(nums[i]);
	    	}
	    	for(int i=k;i<nums.length;i++) {
	    		if(hp.peek() < nums[i]) {
	    			hp.poll();
	    			hp.add(nums[i]);
	    		}
	    	}
	    	return hp.peek();
	    }
}
}

//