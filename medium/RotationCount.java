package medium;

public class RotationCount {
    public static void main(String[] args){
        int[] myarr = new int[] {12, 15, 2};
        System.out.println(findPivot(myarr));


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
}
