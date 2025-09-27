import java.util.*;
public class Filter_Restaurants_by_Vegan_Friendly_Price_and_Distance{
    class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<List<Integer>> ll = new ArrayList<>();
        for (int i = 0; i < restaurants.length; i++) {
            if ((veganFriendly == 0 || restaurants[i][2] == 1) && restaurants[i][3] <= maxPrice
                    && restaurants[i][4] <= maxDistance) {
                ll.add(Arrays.asList(restaurants[i][1], restaurants[i][0]));
            }
        }
        Collections.sort(ll, (a, b) -> {
            if (!a.get(0).equals(b.get(0))) {
                return b.get(0) - a.get(0);
            }
            return b.get(1) - a.get(1);
        });
        List<Integer> ans = new ArrayList<>();
        for (List<Integer> pair : ll) {
            ans.add(pair.get(1)); 
        }
        return ans;
    }
}
}