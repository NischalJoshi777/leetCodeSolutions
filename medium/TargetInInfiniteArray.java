public class TargetInInfiniteArray {
    public static void main(String[] args)
    {

    }

    public int answer(int target, int[] arr){
        int start = 0; 
        int end = 1; 
        int pos; 
        while(target > arr[end]){
           int temp = end+1; 
           end = (end-start+1)*2 + end;
           start = temp;
        } 
        pos = binarySearch(target, start, end, arr);
        return pos;

    }
    
    public int binarySearch(int target, int start, int end, int[] nums) {
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target > nums[mid]){
                start = mid+1; 
            } else if (target < nums[mid]){
                end = mid-1; 
            } else {
                return mid;
            }
        }
        return start;
    }
}
