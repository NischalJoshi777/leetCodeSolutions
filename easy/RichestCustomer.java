package easy;

public class RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] arr: accounts){
            int sum = 0;
            for(int element: arr){
                sum += element;
            }
            if(sum > max) max = sum; 
        }
        return max; 
    }
}

    
