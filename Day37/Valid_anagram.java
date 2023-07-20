package Day37;

// Leetcode Problem 242 

// Valid Anagram

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 
// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true

// My Solution
// https://leetcode.com/problems/valid-anagram/solutions/3793474/beats-99-java-solution/

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()) return false;

        int string1[] = new int[26];

        for (char a1 : s.toCharArray()) string1[a1-'a']++;
        for (char a2 : t.toCharArray()) 
        {
            string1[a2-'a']--;
            if (string1[a2-'a']==-1) return false;
        }

        

        return true;
    }
}

public class Valid_anagram {
    
}
