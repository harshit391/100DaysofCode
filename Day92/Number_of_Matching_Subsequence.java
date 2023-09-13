package Day92;

// Leetcode Problem 792 

// Number of Matching Subsequences

// Given a string s and an array of strings words, return the number of words[i] that is a subsequence of s.

// A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

// For example, "ace" is a subsequence of "abcde".

// Example 1:

// Input: s = "abcde", words = ["a","bb","acd","ace"]
// Output: 3
// Explanation: There are three strings in words that are a subsequence of s: "a", "acd", "ace".

// My Solution
// https://leetcode.com/problems/number-of-matching-subsequences/solutions/4039988/brute-force-solution-java/

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        // Set the initial count to 0
        int count = 0;

        // Set the initial traget to empty string
        String target="";

        // Create a boolean initially set to false beacuse we assuming it down't matching
        boolean result=false;


        for (int i = 0; i < words.length; i++) {
            String t=words[i];

            // If our target is not equal to current word
            if(!target.equals(t)){
                // Set target to t
                target=t;

                // Make result true if current string is subsequence of given string
                result=isSubSequence(s,t);
            }

            // If result become true increase the count
             if(result){
                count++;
            }
        }
        return count;
    }

    public boolean isSubSequence(String s, String t){

        // Initial Set temp to 0 
        int temp = 0;

        for (int j = 0; j < s.length(); j++) {

            // If character in substring is equal to character in given string
            if (t.charAt(temp) == s.charAt(j)) {

                // Increase the temp
                temp++;
            }

            if (temp == t.length()) {
                // If at any case the temp get equal to substring length which tells that all the characters of substring is actually a part of given string
                return true;
            }
        }
        return false;
    }
}

public class Number_of_Matching_Subsequence {
    
}
