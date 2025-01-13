public class PeakIndexMountainArray {
    
    public static void main(String[] args){
        peakIndexInMountainArray(new int[] {1,2,3,4,3,2,1}); 
    }

    static public int peakIndexInMountainArray(int[] arr) {
        int start = 0; 
        int end = arr.length - 1; 
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid+1] > arr[mid]){
                start = mid+1;
            } else if(arr[mid-1] > arr[mid]){ 
                end = mid-1;
            } else {
                return mid;
            }
        }
        return start;
    } 
}
