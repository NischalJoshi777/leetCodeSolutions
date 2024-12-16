// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same typ
package easy;

import java.util.Stack;

public class ValidParethesis {
    public static void main(String[] args){
        Solution sol = new Solution();
        sol.isValid("({[]})");
    }
}


class Solution {
    public boolean isValid(String s) {
     //creating a stack to store the values
     Stack<Character> myStack = new Stack<Character>();
    for(int i= 0; i < s.length(); i++){
        if(s.charAt(i) == '('){
            myStack.push(')');
        } else if (s.charAt(i) == '{'){
            myStack.push('}');
        } else if (s.charAt(i) == '['){
            myStack.push(']');
        } else {
            //if we find a closing bracket then stack should not be empty and the opening bracket on top should be the same as that of current string. 
            if(myStack.isEmpty() || myStack.pop() != s.charAt(i)){
                return false;
            }
        }
    }
        return myStack.isEmpty();
    }
}