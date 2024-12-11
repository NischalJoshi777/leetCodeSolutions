package easy;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9); // Correct array syntax
        System.out.println(Arrays.toString(result)); 
    }
}

class Solution {

    ///important function: 
    /// map.containsKey(key_value) returns boolean value
    /// map.put(key_value, value) 
    /// map.get(key_value) returns value
    public int[] twoSum(int[] nums, int target) {
    
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i ++){
            int difference = target - nums[i];
            if(myMap.containsKey(difference)){
                return new int[]{i, myMap.get(difference)};
            }
            myMap.put(nums[i], i);
        }
        return new int[]{};
    }

}