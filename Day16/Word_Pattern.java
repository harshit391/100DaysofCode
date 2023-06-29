package Day16;

// Leetcode Problem 290 

// Word Pattern

// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

// Example 1:

// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true

// Algorithm

/**
 * Split the string of words by split method
 * Check if length of String of words and Length of pattern is equal is not return false
 * traverse through pattern string if character euqal check the words equal at same indexes
 * If not return false
 * Also If the character are not eqal check if words are equal at that indexes
 * If they are equal return false
 * END
 */

/* ======================================================================================================== */

import java.util.Scanner;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (words.length != pattern.length()) return false;

        for (int i=0;i<pattern.length()-1;i++)
        {
            for (int j=i+1;j<pattern.length();j++)
            {
                if (pattern.charAt(i)==pattern.charAt(j))
                {
                    if (words[i].compareTo(words[j])!=0) 
                    return false;
                }
                else 
                {
                    if (words[i].compareTo(words[j])==0) 
                    return false; 
                }
            }
        }

        return true;
    }
}

public class Word_Pattern {

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        String k = scan.next();

        scan.close();

        Solution sol = new Solution();

        boolean valid = sol.wordPattern(s,k);

        System.out.println(valid);

    }
    
}
