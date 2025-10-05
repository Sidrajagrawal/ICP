import java.util.*;
public class Unique_Paths{
    class Solution {
    public int uniquePaths(int m, int n) {
        boolean[][] maze = new boolean[m][n];
        int[][] dp = new int[m][n];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        return path(0, 0, m, n, maze,dp);
    }

    public int path(int row, int col, int m, int n, boolean[][] maze,int[][] dp) {
        if (row < 0 || row > m - 1 || col < 0 || col > n - 1 || maze[row][col]) {
            return 0;
        }
        if (row == m - 1 & col == n - 1)
            return 1;

        if(dp[row][col] != -1) return dp[row][col];
        int right = 0;
        int down = 0;
        if (maze[row][col] == false) {
            maze[row][col] = true;
            right = path(row, col + 1, m, n, maze,dp);
            down = path(row + 1, col, m, n, maze,dp);
            maze[row][col] = false;
        }

        return dp[row][col] = right + down;
    }
}
}