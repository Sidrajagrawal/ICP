import java.util.*;
public class Longest_Substring_Without_Repeating_Characters{
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() ==0 ) return 0;
        int ans = Integer.MIN_VALUE;
        int ei = 0, si = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(ei < s.length()){
            //grow
            char ch = s.charAt(ei);
            map.put(ch,map.getOrDefault(ch,0)+1);

            //Shrink
            while(map.get(ch) > 1){
                char ch1 = s.charAt(si);
                map.put(ch1,map.get(ch1)-1);
                if(map.get(ch1) == 0) map.remove(ch1);
                si++;
            }

            //ans
            ans = Math.max(ei-si+1,ans);
            ei++;
        }
        return ans;
    }
}
}