package Day20;

// Leetcode Problem 557

// Reverse Words in a String III

// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

// Example 1:

// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"

// Algorithm

/**
 * Split the String into String array splitting by space using regex
 * Create string builder for mutable string
 * Create a loop iterating from 0 to array length
 * Create a inner loop iterating from end of words[i] to 0 
 * Append each character of words[i] to stringbuilder
 * At end of inner loop add one space in string builder
 * Convert the String Builder to string at end and trim it
 * END
 */

/* ============================================================================================== */

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("[ ]+");

        StringBuilder result = new StringBuilder();
        for (int i=0;i<words.length;i++)
        {
            for (int j=words[i].length()-1;j>=0;j--)
            {
                result.append(words[i].charAt(j));
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
}

public class Reverse_Words_in_a_String_III {
    
}
