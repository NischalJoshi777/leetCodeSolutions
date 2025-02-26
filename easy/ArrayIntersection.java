package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args){

    }
    //binary search()
    public int[] intersection(int[] nums1, int[] nums2) {
     Arrays.sort(nums1);
     Arrays.sort(nums2);
    
    Set<Integer> set = new HashSet<>();
    for(int num: nums2){
        if(binarySearch(nums1, num)){
          set.add(num);
        }
    }

    int i = 0; 
    int[] result = new int[set.size()];
    for (int num : set) {
        result[i++] = num;
    }
    return result;
    }

    boolean binarySearch(int[] nums, int num){
       int start = 0; 
       int end = nums.length -1;
       while(start <= end){
        int mid = start+ (end-start)/2;
        if(nums[mid] == num){
            return true;
        } else if(nums[mid] < num){
            start = mid + 1;
        } else{
           end = mid - 1;
        }
        }
    return false;
    }
      
    

    using normalSearch(int[] nums1, int[] nums2){
        //s1 creating a set for nums1 to store
        //because set has not duplicate item.
        Set<Integer> s1 = new HashSet<Integer>();
        for(int num1: nums1){
            s1.add(num1);
        }
        //creating a set to store the elements uniquely. 
        Set<Integer> st2 = new HashSet<>();
        for(int num2: nums2){
            if(s1.contains(num2)){
                st2.add(num2);
            }
        }
       int[] result = new int[st2.size()];
       int i = 0;
       for(int nums: st2){
        result[i] = nums;
        i++;
       }
           return result;
    }
} {
    
}
