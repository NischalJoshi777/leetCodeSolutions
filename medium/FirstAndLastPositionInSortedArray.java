// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

class FirstAndLastPositionInSortedArray {

    public static void main(String[] args){
        int[] arr = {'c','f','g'};
        int target = 'c';
        searchRange1(arr, target);
        // findRange(nums,  target);
    }

    static int[] findRange(int[] nums, int target){
        int[] arr = new int[] {};
        arr[0] = searchIndex(nums, target, true);
        arr[1] = searchIndex(nums, target, false);
        return arr;

    }


    static  int[] searchRange1(int[] nums, int target) {
        int[] ans = {-1, -1};
        int n = nums.length;
        int start = 0; 
        int end = n - 1; 
        while(start<= end){
            mid = start + (end - start)/2;
            if(target < nums[mid]){
                end  = mid -1 ;
            } else if(target > nums[mid]){
                start = mid+1;
            } else {
                while(nums[start] != target){
                    start++;
                }
                while(nums[end] != target){
                    end--;
                }
                ans[0] = start;
                ans[1] = end;
                return ans;

            }
         }
        return ans;
    }


    static  int searchIndex(int[] nums, int target, bool searchFirst) {
        int ans = -1;
        int n = nums.length;
        int start = 0; 
        int end = n - 1; 
        while(start<= end){
            mid = start + (end - start)/2;
            if(target < nums[mid]){
                end  = mid -1 ;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else {
                ans = mid;
                if(searchFirst){
                    end = mid - 1; 
                } else { 
                    start = mid + 1;
                }
            }
         }
        return ans;
    }

}