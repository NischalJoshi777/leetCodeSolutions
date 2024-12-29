package medium;

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
