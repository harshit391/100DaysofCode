package Day74;

// Leetcode Problem 150 

// Evaluate Reverse Polish Notation

// You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

// Evaluate the expression. Return an integer that represents the value of the expression.

// Note that:

// The valid operators are '+', '-', '*', and '/'.
// Each operand may be an integer or another expression.
// The division between two integers always truncates toward zero.
// There will not be any division by zero.
// The input represents a valid arithmetic expression in a reverse polish notation.
// The answer and all the intermediate calculations can be represented in a 32-bit integer.
 
// Example 1:

// Input: tokens = ["2","1","+","3","*"]
// Output: 9
// Explanation: ((2 + 1) * 3) = 9



import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        // Creata a Stack
        Stack<Integer>stack=new Stack<>();

        // Traverse through String Array
        for (int i=0;i<tokens.length;i++){
            // If String[i] is equal to any on eof + , - , * , / 
            if (tokens[i].equals("+") ||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                // Store Topmost 2 elements by pop method
                int p2=stack.pop();
                int p1=stack.pop();
                // And according to operator Just Fill the value in Stack
                if (tokens[i].equals("+"))
                    stack.push(p1+p2);
                if (tokens[i].equals("-"))
                    stack.push(p1-p2);
                if (tokens[i].equals("*"))
                    stack.push(p1*p2);
                if (tokens[i].equals("/"))
                    stack.push(p1/p2);
            }
            // In case String is not operator Convert it to Integer and push it in stack
            else
            stack.push(Integer.valueOf(tokens[i]));
        }
        // Return Top element in stack
        return stack.peek();
    }
}

public class Evaluate_Reverse_Polish_Notation {
    
}
