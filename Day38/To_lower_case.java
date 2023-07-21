package Day38;

// Leetcode Problem 709 

// To Lower Case

// Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

// Example 1:

// Input: s = "Hello"
// Output: "hello"

// My Solution
// https://leetcode.com/problems/to-lower-case/solutions/3795639/beats-100-easy-java-solution/

class Solution {
    public String toLowerCase(String s) {
        
        // Create a character array of String s
        char[] ans = s.toCharArray();

        // Traverse through character array
        for (int i=0;i<ans.length;i++)
        {
            // If character is uppercase
            if (ans[i]>='A' && ans[i]<='Z')
            {
                // Replace it by its lower case version
                int temp = ans[i] + ' '; // as 'A' = 65 and ' ' = 32
                // So 'A' + ' ' = 'a' (65+32 = 97)

                // convert the integer obtained to character and update it to character index
                ans[i] = (char)temp;
            }
        }

        // return a String created of character array
        return new String(ans);

    }
}

public class To_lower_case {
    
}
