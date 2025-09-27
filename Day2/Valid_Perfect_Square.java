import java.util.*;
public class Valid_Perfect_Square{
    class Solution {
    public boolean isPerfectSquare(int num) {
        long s=1,e=num;
        boolean ans = false;
        while(s<=e){
            long m=s+(e-s)/2;
            long sq= m*m;
            if(sq > num){
                 e=m-1;
            }
            else if(sq < num){
                s=m+1;
            }
            else{
                ans =true;
                break;
            }
        }
        return ans;
    }
}
}

//