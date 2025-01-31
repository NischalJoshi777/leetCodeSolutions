

public class LongestPalindromeSubString {

    public static void main(String[] args){

    }

    public String longestPalindrome(String s) {
        int start = 0, maxLength = 0;
         for (int i = 0; i < s.length(); i++) {
             // Odd palindrome has one character in center
             int[] odd = expandAroundCenter(s, i, i);
             if (odd[1] - odd[0] + 1 > maxLength) {
                 start = odd[0];
                 maxLength = odd[1] - odd[0] + 1;//.subString method as exclusive 2nd parameter
             }
             // Even palindrome (centered between two characters)
             int[] even = expandAroundCenter(s, i, i + 1);
             if (even[1] - even[0] + 1 > maxLength) {
                 start = even[0];
                 maxLength = even[1] - even[0] + 1;
             }
         }
 
         return s.substring(start, start + maxLength);
      }
     
      int[] expandAroundCenter(String s, int left, int right) {
         while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
             left--;
             right++;
         }
         return new int[]{left + 1, right - 1};
     }
}
