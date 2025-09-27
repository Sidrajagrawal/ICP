import java.util.*;
public class Search_a_2D_Matrix{
    class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        List<Integer> ans = new ArrayList<Integer>();

        int dir = 0;

        int top=0;
        int down=row-1;

        int left = 0;
        int right = col-1;

        while(top<=down && left<=right){

            if(dir == 0){
                for(int i=left; i<=right; i++){
                    ans.add(matrix[top][i]);
                }
                top++;
            }

            if(dir == 1){
                for(int i=top; i<=down; i++){
                    ans.add(matrix[i][right]);
                }
                right--;
            }

            if(dir == 2){
                for(int i=right; i>=left; i--){
                    ans.add(matrix[down][i]);
                }
                down--;
            }

            if(dir == 3){
                for(int i=down;i>=top; i--){
                    ans.add(matrix[i][left]);
                }

                left++;
            }

            dir++;
            if(dir == 4){
                dir = 0;
            }
        }
        return ans;
    }
}
}