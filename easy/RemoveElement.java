package easy;

public class RemoveElement {
        public int removeElement(int[] nums, int val) {
            int current = 0;
            int end = nums.length - 1;
            while(current <= end){
                if(nums[current] != val ){
                    current++;
                } else {
                    nums[current] = nums[end];
                    end--;
                }
            }
        return current;
    }
}

