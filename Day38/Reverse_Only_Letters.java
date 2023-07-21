package Day38;

// Leetcode Problem 917 

// Reverse Only Letters

// Given a string s, reverse the string according to the following rules:

// All the characters that are not English letters remain in the same position.
// All the English letters (lowercase or uppercase) should be reversed.
// Return s after reversing it.

// Example 1:

// Input: s = "ab-cd"
// Output: "dc-ba"

// My Solution
// https://leetcode.com/problems/reverse-only-letters/solutions/3797468/beats-100-simple-java-solution/

class Solution {
    private boolean isValid(char k)
    {
        // If character is a alphabet lowercase or uppercase return true
        if (k>='a' && k<='z') return true;
        else if (k>='A' && k<='Z') return true;

        // otherwise return false
        return false; 
    }

    public String reverseOnlyLetters(String s) {

        // Create a character array of string 
        char[] ch = s.toCharArray();

        // Set two index as 0 and last index of array respectively
        int idx1 = 0;
        int idx2 = ch.length-1;

        while (idx1<=idx2)
        {
            // if character at idx1 is alphabet
            if (isValid(ch[idx1]))
            {
                // if character at idx2 is alphabet
                if (isValid(ch[idx2]))
                {
                    // Swap
                    char temp = ch[idx1];
                    ch[idx1] = ch[idx2];
                    ch[idx2] = temp;

                    // Increment and decrement idx1 and idx2 by 1 resprectively
                    idx1++;
                    idx2--;
                }
                // if character at idx2 is not alphabet decrement idx2 by 1
                else idx2--;
            }  
            // if character at idx1 is not alphabet increment idx1 by 1
            else idx1++;
        }

        // convert character array to string and return it
        return new String(ch);

    }
}

public class Reverse_Only_Letters {
    
}
