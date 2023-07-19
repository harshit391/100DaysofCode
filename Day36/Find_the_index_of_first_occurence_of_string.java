package Day36;

// Leetcode problem 28 

// Find the Index of the First Occurrence in a String

// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

// My Solution
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/solutions/3786333/beats-100-easiest-solution-ever/?envType=list&envId=ovcoj3f3

class Solution {
    public int strStr(String haystack, String needle) {

        int found = -1;
        
        int lon = needle.length();

        for (int i=0;i<haystack.length()-lon+1;i++)
        {
            String h_sub = haystack.substring(i,i+lon);
            if (h_sub.equals(needle)) {found = i;break;}
        }

        return found;
        
    }
}

public class Find_the_index_of_first_occurence_of_string {
    
}
