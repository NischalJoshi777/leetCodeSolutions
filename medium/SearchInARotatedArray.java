public class SearchInARotatedArray {
   
    public static void main(String[] args){
        int[] myArr = {4,5,6,7,0,1,2};
        int target = 3; 
       System.out.println(search(myArr, target));

    }

    static int search(int[]nums, int target) {
        int start = 0; 
        int end = nums.length-1;
        int mid;
        while(start<=end) {
        mid = start + (end-start)/2;
        if(nums[mid] == target){
            return mid;
        } else if(nums[start] <=nums[mid]){
            if( nums[start] <= target && target <= nums[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }

         } else {
            if(nums[mid] <= target && target <= nums[end]){
                start = mid+1;
            } else {
                end = mid -1 ;
            }
         }
        }
        return -1;
    }
} 