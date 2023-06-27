package Day14;

// Leetcode Problem 28

// Find the Index of the First Occurrence in a String

// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

// Algorithm

/**
 * Creating a found int variable and initialize it to -1
 * count the length of string needle
 * In a loop create a substring as per the needle length
 * check substring with needle using compare
 * If it  return 0 change found to ith index and break as per first occurence
 */

/* =============================================================================================================== */

import java.util.*;

class Solution {
    public int strStr(String haystack, String needle) {

        int found = -1;
        
        int lon = needle.length();

        for (int i=0;i<haystack.length()-lon+1;i++)
        {
            String h_sub = haystack.substring(i,i+lon);
            if (h_sub.compareTo(needle)==0) {found = i;break;}
        }

        return found;
        
    }
}


public class first_occurence_substring_in_string {
    
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        String k = scan.next();

        scan.close();

        Solution sol = new Solution();

        int occurence_index = sol.strStr(s,k);

        System.out.println(occurence_index);


    }
}
