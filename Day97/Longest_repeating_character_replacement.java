package Day97;

// You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

// Return the length of the longest substring containing the same letter you can get after performing the above operations.

// Example 1:

// Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Replace the two 'A's with two 'B's or vice versa.

// My Solution
// https://leetcode.com/problems/longest-repeating-character-replacement/solutions/4060147/beats-93-easy-java-solution/

class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] arr = new int[26];

        char[] ch = s.toCharArray();
        
        int largestCount = 0, start = 0, maxlen = 0;
        
        for(int end = 0; end < ch.length; end ++){
            arr[ch[end] - 'A']++;
            // largestCount = unique character in the current window...
            largestCount = Math.max(largestCount, arr[ch[end] - 'A']);
            
            if(end - start + 1 - largestCount > k){ 
                arr[ch[start] - 'A']--;
                start ++;
            }
            // maxlen = maximum length of repeating character & end - start + 1 = size of the current window...
            maxlen = Math.max(maxlen, end - start + 1);
        }
        return maxlen;
    }
}

public class Longest_repeating_character_replacement {
    
}
