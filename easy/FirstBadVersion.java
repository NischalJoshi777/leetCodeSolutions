package easy;

public class FirstBadVersion { 
    public int firstBadVersion(int n) {
        int low = 1; 
        int end = n;
        if(n==1) return n; 
        while(low <= end){
           int mid = low+(end-low)/2;     
           if(!isBadVersion(mid)){//is BadVersion is a boolean function defined already
              low = mid+1; 
           } else {
             end = mid-1;
           }
        } 
        return low;
     }
}
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
 

