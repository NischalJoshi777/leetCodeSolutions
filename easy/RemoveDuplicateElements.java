package easy;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.removeDuplicates( new int[]{0,1,1,1,2,2});
    }
}

class Solution{
    public int removeDuplicates(int[] nums) {
        //this is the index or a pointer to determine the unique elements
        //in base case we take current or first index value i.e. nums[0] as unique;
        int myPointer = 0 ;
        for(int i = 1; i < nums.length; i++){// start from the 2nd element  of the list since current is 1st element
            if(nums[myPointer] != nums[i]){ //checks if the second element is not equal to first
              myPointer++; //this means its a unique element so we move the pointer to that index 
              nums[myPointer] = nums[i]; // after moving we keep the unique element at that index. 
            }
    }
     return myPointer+1;
}}
