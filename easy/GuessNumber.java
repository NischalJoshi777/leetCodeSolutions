package easy;

public class GuessNumber {
    public int guessNumber(int n) {
        int start = 1; 
        int end = n;
        int mid;
        while(start<= end){
        mid = start + (end-start)/2;
        if(guess(mid) == 0) {
            return mid;
        } else if(guess(mid) == -1){
            end = mid - 1; 
        } else {
            start = mid+1;
        }
    }
            return start;

    }
}