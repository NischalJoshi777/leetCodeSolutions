package easy;

public class EvenDigitsCount {

   public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            int length = digitCount(num);
            if(length%2 == 0) count++;
        }  
        return count;
  }
  
  //optimized way to count decimal numbers or get length; 
  static int digitCount(int num){
        return (int)Math.log10(num) + 1;
        //log10(10) returns 1; 
    }
  
  //traditional way to get the length
  static int digitCount2(int num){
    return(Integer.toString(num).length());
  }   
    
}
