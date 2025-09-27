import java.util.*;
public class Search_a_2D_Matrix{
    class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return bs(matrix, target);
    }

    public static boolean bs(int[][] arr, int t) {
        int n = arr.length; 
        int m = arr[0].length; 
        int s = 0;
        int e = n * m - 1; 

        while (s <= e) {
            int mid = (s + e) / 2;
            int val = arr[mid / m][mid % m]; 
            if (val > t) {
                e = mid - 1;
            } else if (val < t) {
                s = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
}