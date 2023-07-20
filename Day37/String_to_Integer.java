package Day37;

// Leetcode Problem 8 

// String to Integer (atoi)

// Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

// The algorithm for myAtoi(string s) is as follows:

// Read in and ignore any leading whitespace.
// Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
// Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
// Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
// If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
// Return the integer as the final result.
// Note:

// Only the space character ' ' is considered a whitespace character.
// Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 

// Example 1:

// Input: s = "42"
// Output: 42
// Explanation: The underlined characters are what is read in, the caret is the current reader position.
// Step 1: "42" (no characters read because there is no leading whitespace)
//          ^
// Step 2: "42" (no characters read because there is neither a '-' nor '+')
//          ^
// Step 3: "42" ("42" is read in)
//            ^
// The parsed integer is 42.
// Since 42 is in the range [-231, 231 - 1], the final result is 42.

// My Solution
// https://leetcode.com/problems/string-to-integer-atoi/solutions/3793420/beats-100-java-solution/

class Solution {
    public int myAtoi(String s) {
        int neg = 1; // To Check the result gonna be positive or negetive

        int i = 0; // index to track 

        long num = 0; // Our result Integer

        while (i<s.length())
        {
            char k = s.charAt(i); 

            // If there is no space 
            if (k!=' ')
            {
                if (k=='-') // it checks the first character after the space ends is minus 
                neg = -1; // if there is negetive then make the neg -1

                if (k=='+' || k=='-') // It automatically skips the sign  
                i++; // dont forget to increment i 

                break; // break it to get i where we have to start getting our result
            }
            // If there is a space increment i 
            i++;
        }

        while (i<s.length())
        {
            char k = s.charAt(i);

            // if the character is not a number break 
            if (k<'0' || k>'9') break;

            num = num*10 + (k-'0'); // convert character to integer and append it to num

            // if at any point num less than minimum value of an integer return minimum        value of an integer

            if (num*neg<=Integer.MIN_VALUE) return Integer.MIN_VALUE;

            // if at any point num exceeds maximum value of an integer return the maximum value of an integer
            if (num*neg>=Integer.MAX_VALUE) return Integer.MAX_VALUE;

            // increment the index
            i++;
        }

        
        // return num multiplied by neg to check if the result should be negetive or positive according to given string
        return (int)num*neg;
    }
}

public class String_to_Integer {
    
}
