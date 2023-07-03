package Day20;

// Leetcode Problem 521

// Longest Uncommon Subsequence I

// Given two strings a and b, return the length of the longest uncommon subsequence between a and b. If the longest uncommon subsequence does not exist, return -1.

// An uncommon subsequence between two strings is a string that is a subsequence of one but not the other.

// A subsequence of a string s is a string that can be obtained after deleting any number of characters from s.

// For example, "abc" is a subsequence of "aebdc" because you can delete the underlined characters in "aebdc" to get "abc". Other subsequences of "aebdc" include "aebdc", "aeb", and "" (empty string).
 

// Example 1:

// Input: a = "aba", b = "cdc"
// Output: 3
// Explanation: One longest uncommon subsequence is "aba" because "aba" is a subsequence of "aba" but not "cdc".
// Note that "cdc" is also a longest uncommon subsequence.

// Algorithm

/**
 * First their lengths are not equal return the string with maximum length
 * Else initialize an index with -1
 * interate from 0 to string length
 * check substring of both strings dynamically created from 0 to i at every iteratin 
 * if they become equal continue the loop
 * else set index to i
 * At end return index
 * END
 */

/* =============================================================================================== */ 

class Solution {
    public int findLUSlength(String a, String b) {
        if (a.length()!=b.length()) return Math.max(a.length(),b.length());

        int index =  -1;
        for (int i=1;i<=a.length();i++)
        {
            if (a.substring(0,i).equals(b.substring(0,i))) 
            {
                continue;
            }
            else index = i;
        }

        return index;

        


    }
}

public class Longest_Uncommon_Subsequence_I {
    
}
