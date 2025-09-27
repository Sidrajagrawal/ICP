import java.tuil.*;
class Can_Place_Flowers{
    class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int temp = n;
        if(n == 0) return true;
        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i] == 0){
                if(isPlace(flowerbed,i)){
                    flowerbed[i] = 1;
                    temp--;
                }
            }if(temp == 0) return true;
        }
        return temp == 0;
    }
    public boolean isPlace(int[] arr,int i){
        if(i == 0){
            if(arr.length == 1) return true;
            return arr[i+1] == 0; 
        }if(i == arr.length-1){
            return arr[i-1] == 0;
        }
        return arr[i-1] == 0 && arr[i+1] == 0; 
    }
}
}

//