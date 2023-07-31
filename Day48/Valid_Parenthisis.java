package Day48;

import java.util.Stack;

// Leetcode Problem 20 

// Valid Parentheses

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 
// My Solution
// https://leetcode.com/problems/valid-parentheses/solutions/3841368/best-solution-using-stack-in-java-beats-91/

// Example 1:

// Input: s = "()"
// Output: true

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        // Create a Character array 
        char[] arr = s.toCharArray();

        for(char c : arr) {
            switch(c) {

                // In case of opening brackets push closing bracket of same type to stack
                case '(' : stack.push(')'); break;
                case '{' : stack.push('}'); break;
                case '[' : stack.push(']'); break;

                // If there is no opening bracket then check if the first character of stack is of same type as in the string using pop method
                // If not return false there 
                default  : if(stack.isEmpty() || stack.pop() != c) return false;
            }
        }

        // Return whether string become empty at the end or not 
        // If its empty which means all the opening brackets have closing brackets as per our conditions of validity
        return stack.isEmpty();
    }
}

public class Valid_Parenthisis {
    
}
