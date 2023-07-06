package Day23;

// Leetcode Problem 917

// Reverse Only Letters

// Given a string s, reverse the string according to the following rules:

// All the characters that are not English letters remain in the same position.
// All the English letters (lowercase or uppercase) should be reversed.
// Return s after reversing it.

// Example 1:

// Input: s = "ab-cd"
// Output: "dc-ba"

// Algorithm


/**
 * Create a function which check whether the character is alphabet or not
 * Create a stringbuilder sb of string s
 * set start index to 0 and last index to last element index of string
 * create a while loop which check start index is less than last index
 * if character at start index is not alphabet increment start index by 1 and continue the loop from start
 * else if character at last index is not alphabet decrement last index by 1 and continue the loop from start
 * else replace the start index character by last index character
 * Convert string builder to string
 * END
 */

/* =============================================================================================== */

class Solution {
    private boolean isValid(char s)
    {
        boolean valid = true;
        if (s>='a' && s<='z') valid = false;
        else if (s>='A' && s<='Z') valid = false;

        return valid;
    }

    public String reverseOnlyLetters(String s) {

        StringBuilder sb = new StringBuilder(s);
        
        int start_index = 0;
        int last_index = s.length()-1;

        while (start_index<last_index)
        {
            if (isValid(sb.charAt(start_index)))
            {start_index++;continue;}

            else if(isValid(sb.charAt(last_index)))   
            {last_index--;continue;}


            
            char temp = sb.charAt(start_index);
            sb.setCharAt(start_index,sb.charAt(last_index));
            sb.setCharAt(last_index,temp);

            start_index++;
            last_index--;
            
            
        }

        return sb.toString();


    }
}

public class Reverse_Only_Letters {
    
}
