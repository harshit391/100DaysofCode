package Day79;

import java.util.Stack;

// Leetcode Problem 227 

// Basic Calculator II

// Given a string s which represents an expression, evaluate this expression and return its value. 

// The integer division should truncate toward zero.

// You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].

// Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

// Example 1:

// Input: s = "3+2*2"
// Output: 7

// My Solution
// https://leetcode.com/problems/basic-calculator-ii/solutions/3984595/easy-stack-solution-java/

class Solution {
    public int calculate(String s) {
        
        Stack<Integer> stack = new Stack<>();

        char[] ch = s.toCharArray();
        // Our main Number to be stored
        int num = 0;

        // Initiate a pointer which keep track of characters of String
        char op = '+';

        for (int i=0;i<ch.length;i++)
        {
            // If there is digit like 10 we have to add its as it is 
            if (Character.isDigit(ch[i]))
            num = num*10+ch[i]-'0';

            // If there comes a operator
            if (!Character.isDigit(ch[i]) && ch[i]!=' ' || i==ch.length-1)
            {
                // If + push current num
                if (op=='+')
                stack.push(num);

                // If - push - of current num
                else if (op=='-')
                stack.push(-num);

                // If * pop the top element from stack 
                // Multiply it by current num
                // Push it in the stack
                else if (op=='*')
                stack.push(stack.pop()*num);

                // If / pop the top element from stack
                // Divide it by current num
                // Push it back in the stack
                else if (op=='/')
                stack.push(stack.pop()/num);

                // Reset the number by 0
                num = 0;
                // And set the pointer to current character
                op = ch[i];
            }
        }

        // Set a main result
        int result = 0;

        // Add all elements of stack in result
        while (!stack.isEmpty())
        {
            result += stack.pop();
        }

        // return the result
        return result;
    }
}

public class Basic_Calculator {
    
}
