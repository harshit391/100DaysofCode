package Day21;

// Leetcode Problem 709

// To Lower Case

// Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

// Example 1:

// Input: s = "Hello"
// Output: "hello"

// Algorithm

/**
 * Create a string builder result for mutable string
 * iterate through string s
 * if any character is uppercase then add 32 to its ascii value and replace it
 * At End Convert result to String
 * END
 */

/* ======================================================================================= */

class Solution {
    public String toLowerCase(String s) {
        
        StringBuilder result = new StringBuilder(s);

        for (int i=0;i<result.length();i++)
        {
            if (result.charAt(i)>='A' && result.charAt(i)<='Z') 
            {
                int m = (int)(result.charAt(i));

                m+=32;

                result.setCharAt(i,(char)(m));
            }
        }

        return result.toString();

    }
}

public class To_Lower_Case {
    
}
