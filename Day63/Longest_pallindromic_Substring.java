package Day63;

// Leetcode Problem 5 

// Longest Palindromic Substring

// Given a string s, return the longest palindromic substring in s.

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.

// My Solution
// https://leetcode.com/problems/longest-palindromic-substring/solutions/3912613/beats-99-5-java/

class Solution {
    int maxLen = 0;
    int start = 0;
    public String longestPalindrome(String s) {
        
        int n = s.length();
        char[] arr = s.toCharArray();
        for(int i = 0; i < n ; i++) {
            // For odd length palidrome check
            extendForPalindrome(arr, i, i);  
            // For even length palindrome check
            extendForPalindrome(arr, i, i+1);
        }

        return s.substring(start, start + maxLen);
    }

    public void extendForPalindrome(char[] s, int i, int j) {
        // Check at what extends the string length is going
        while(i >= 0 && j < s.length && s[i]==s[j]) {
            i--;
            j++;
        }
        
        // Storing max length if calculated palindrome length is Maximum.
        // Keeping start index, So that we can use substring to get the Palindrome String.
        if(maxLen < j - i - 1) {
            maxLen = j - i - 1;
            start = i+1;
        }
    }
}

public class Longest_pallindromic_Substring {
    
}
