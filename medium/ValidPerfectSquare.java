public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int start = 0; 
        int end = num/2; 
        if(num <= 1) return true;
        while(start <=end){
            int mid = start + (end-start)/2;
            long sqr = (long) mid*mid;
            if(sqr == num){
                return true;
            } else if(sqr > num){      
                 end = mid - 1;
            } else {
                start = mid + 1; 
        }
    }
     return false; 
    }
    
}
