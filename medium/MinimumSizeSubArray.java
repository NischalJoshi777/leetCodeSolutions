// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package medium; 

class MininumSizeSubArray{
    public static void main(String[] args) {
        MininumSizeSubArraySolution sol = new MininumSizeSubArraySolution();
      int value = sol.minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1,1});
      System.out.println(value);
    }  
}

class MininumSizeSubArraySolution{
    public int minSubArrayLen(int target, int[] nums) {
     int minLen = Integer.MAX_VALUE;
     int left = 0; 
     int currentSum = 0; 
     for(int right = 0; right < nums.length; right++){
         currentSum += nums[right];
         while(currentSum >= target){
             minLen = Math.min(minLen, right-left+1);
             currentSum -= nums[left];
             left++;
         } 
     }
     if(minLen == Integer.MAX_VALUE){
         return 0;
     }
     return minLen; 
 }
}