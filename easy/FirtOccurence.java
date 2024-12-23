package easy;

public class FirtOccurence {
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.strStr("badbutsad", "sad"));
    }
    
}

class Solution {
    public int strStr(String haystack, String needle) {
        int stringLength = haystack.length(); 
        int patternLength = needle.length();
        if (patternLength == 0) return 0;
        if (stringLength < patternLength) return -1;
        int[] lps = new int[patternLength];
        computeLpsArray(needle, lps);
        int j = 0; // Pointer for the needle
        for (int i = 0; i < stringLength; i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
                if (j == patternLength) {
                    return i + 1 - j; // Match found, return start index
                }
            } else {
                if (j != 0) {// ignoring the first case of j = 0
                    j = lps[j - 1]; //resetting the value of j
                    i--; // char at i needs to checked again
                }
            }
        }
        return -1; // No match found
    }

    private void computeLpsArray(String pattern, int[] lps) {
        int len = 0; // Length of the previous longest prefix 
        int i = 1;
        lps[0] = 0; 
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; 
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}
