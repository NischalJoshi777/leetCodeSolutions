package easy;

class KthMissingItem { 
    public static void main(String[] args){

    }

    public int findKthPositive(int[] arr, int k) {
        int counter = 0; 
        int num = 0; 
        int i = 0;
        while(counter < k){
            if(i < arr.length && arr[i] == num+1){
                i++;
            } else {
                counter ++;
            }
            num++;
        }
        return num;
     }

}