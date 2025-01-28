package medium;

public class RotationCount {
    public static void main(String[] args){
        int[] myarr = new int[] {12, 15, 2};
        System.out.println(findPivot(myarr));
        System.out.println(findPivot2(myarr, 0, myarr.length-1));


    }

    static int findPivot(int[] nums){
        int start = 0; 
        int end = nums.length - 1 ;
        int mid; 
        while(start <end){
            mid = start + (end-start)/2;
            if(nums[mid] > nums[end]){
                start= mid+1;
            }else{
                end = mid;
            }
        
        }
        return start; 
    }

    static int findPivot2(int arr[], int low, int high)
    {
       // base cases
       if (high < low)  return -1;
       if (high == low) return low;
    
       int mid = (low + high)/2;   /*low + (high - low)/2;*/
       if (mid < high && arr[mid] > arr[mid + 1])
         return mid+1;
       if (mid > low && arr[mid] < arr[mid - 1])
         return (mid);
       if (arr[low] >= arr[mid])
         return findPivot2(arr, low, mid-1);
       else
         return findPivot2(arr, mid + 1, high);
    }
    
}
