package Day58;

import java.util.HashSet;
import java.util.Set;

// Leetcode Problem 3 

// Longest Substring Without Repeating Characters

// Given a string s, find the length of the longest substring without repeating characters.

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

// My Solution
// https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/3890976/easy-two-pointers-approach-java-beats-84/

class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Track the maximum length achieved
        int max = 0;

        // Two Start and end points of 
        int start = 0;
        int end = 0;

        // Set to track repeating characters
        Set<Character> temp = new HashSet<>();
        

        while (end<s.length())
        {   
            // If Set not contains the character os String at end index 
            if (!temp.contains(s.charAt(end)))
            {
                // Add that character in set 
                temp.add(s.charAt(end));
                // Keep updating the max with maximum size achieved by set
                max = Math.max(max,temp.size());
                // Increment end index by 1
                end++;
            }
            else 
            {
                // If repeating character found remove the character at start index from set
                temp.remove(s.charAt(start));
                // Increment start by 1
                start++;
            }
        }

        // return the max at end
        return max;
        
    }
}

public class Longest_Substring_Without_Repeating_Character {
    
}
