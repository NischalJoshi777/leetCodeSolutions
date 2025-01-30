package easy;

public class sqrt {
    public int mySqrt(int x) {
        int start = 1; 
        int end =  x;
        // long sqrt; 
        if(x<=1) return x; 
        while(start < end){
            int mid = start+(end-start)/2;
            // sqrt = mid*mid;
            if(mid <= x/mid && (mid+1) > x/(mid+1)){ //to avoid the out of range issue or we can use long
                return mid;     
            } else if (mid > x/mid){
                end = mid-1; 
            } else {
                start = mid+1;
            }
        }
        return end ;
    }

}

