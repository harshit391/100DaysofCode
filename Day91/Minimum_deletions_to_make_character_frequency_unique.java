package Day91;

import java.util.HashSet;

// Leetcode Solution 1647 

// Minimum Deletions to Make Character Frequencies Unique

// A string s is called good if there are no two different characters in s that have the same frequency.

// Given a string s, return the minimum number of characters you need to delete to make s good.

// The frequency of a character in a string is the number of times it appears in the string. For example, in the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.

// Example 1:

// Input: s = "aab"
// Output: 0
// Explanation: s is already good.

// My Solution
// https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/solutions/4035763/beats-98-easy-hash-set-java/

class Solution {
    public int minDeletions(String s) {
        // Create a Frequency array
        int frequency[] = new int[26];

        // Convert string to character array and start iterating
        for (char k : s.toCharArray())
        {
            frequency[k-'a']++;
        } 

        // Create a HashSet
        HashSet<Integer> set = new HashSet<>();
        // Set initial count to 0
        int count = 0;

        for (int i=0;i<26;i++)  
        {   
            // If frequency is more than 0 and set already contains same frequency 
            while (frequency[i]>0 && set.contains(frequency[i]))
            {
                // Increase the count and decrease that frequency
                count++;
                frequency[i]--;
            }
            // If set do not contains frequency add to it
            set.add(frequency[i]);
        }
    
        return count;
    }
}

public class Minimum_deletions_to_make_character_frequency_unique {
    
}
