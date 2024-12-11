package easy;

public class Pallindrome {
    public static void main(String[] args){
        Solution sol = new Solution();
        int number = 121; // Example number to test
        boolean result = sol.isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + result);
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false; 
        int xcopy  = x; 
        int reverse = 0; 
        while(x>0){
            reverse = x%10 + reverse *10;
            x = x/10;
        }
        return xcopy == reverse;
    }
}

