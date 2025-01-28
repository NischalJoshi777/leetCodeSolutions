package hard;

class SplitArrayLargestSum{
    public static  void main(String[] args){
      System.out.println(splitArray(new int[] {1,2,3,4, 5}, 2));
    }  
    static int splitArray(int[] nums, int k) {
        int start = 0; 
        int end = 0; 
        int mid; 
        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while(start < end){
            mid = start+ (end-start)/2;
            int arrayCount = calculatePartitions(mid, nums);
            if(arrayCount <= k){
                end = mid;
            }else{
                start  = mid+1;
            }
        }  
        return start;
    }

   static int calculatePartitions(int mid, int[] nums){
        int arraycount = 1;
        int sum = 0;
         for(int i = 0; i < nums.length; i++){
                if(sum + nums[i] <= mid) {
                  sum += nums[i];
                } else {
                    sum = nums[i];
                    arraycount++;
            }
         }
         return arraycount;
    }
}