package easy;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.romanToInt("III");
    }

}
class Solution {
    public int romanToInt(String s) {
       int number = 0; 
       HashMap<Character, Integer> myHashMap = new HashMap<Character, Integer>();
       myHashMap.put('I', 1);
       myHashMap.put('V', 5);
       myHashMap.put('X',10);
       myHashMap.put('L', 50);
       myHashMap.put('C', 100);
       myHashMap.put('D', 500);
       myHashMap.put('M', 1000);
       for(int i = 0; i < s.length(); i ++){
            int current = myHashMap.get(s.charAt(i));
            int next =  (i+1 < s.length())? myHashMap.get(s.charAt(i+1)) : 0;
            if(current > next){
                number += current;
            } else {
                number -= current;
            };
       }
       return number;
    }
}
