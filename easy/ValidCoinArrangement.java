package easy;

public class ValidCoinArrangement {
    public int arrangeCoins(int n) {
        int start = 1; 
        int end = n;
        while(start <= end){
           int mid  = start+ (end-start)/2;
           if(n >= (long) mid*(mid+1)/2){ //mid*(mid+1)/2 gives the total coin count required till      mid number of rows;
             start = mid+1;
           }else{
            end= mid-1;
           }
        }
        return end;
    }
}
