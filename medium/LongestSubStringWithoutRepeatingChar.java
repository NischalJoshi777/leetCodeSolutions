package medium;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args){

    }
}

//
class BruteSolution {
    public int lengthOfLongestSubstring(String s) {
        String longestSubString = "";
        String placeholder = longestSubString;
        int startIndex = 0; 
        String currentSubString = "";
        for(int i = 1; i <= s.length(); i++){
            currentSubString =  s.substring(startIndex, i);
            if(!placeholder.contains(String.valueOf(s.charAt(i-1)))){
                if(currentSubString.length() > placeholder.length()){
                    placeholder = currentSubString;
                if(placeholder.length() > longestSubString.length()){
                      longestSubString = placeholder;
                    }
                } 
            } else {
                startIndex += 1;
                i = startIndex;
                placeholder = "";
            }
        }
        return longestSubString.length();
    }
}


class SlidingWindowP{
    public int lengthOfLongestSubstring(String s) {
        int maxlength = 0; // setting it to lowest possible value;  
        int left = 0; // starting index of the window
        HashSet <Character> subStringSet = new HashSet<Character>();
        for(int right = 0; right < s.length(); right++){ //right is the closing index  
            char current = s.charAt(right);
            while(subStringSet.contains(current)){ 
                subStringSet.remove(s.charAt(left));
                left++;
            }
            subStringSet.add(current);
            maxlength = Math.max(maxlength, right+1-left);
        }
        return maxlength;
    }
}