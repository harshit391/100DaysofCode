package Day15;

// Leetcode Problem 387

// First Unique Character in a String

// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// Example 1:

// Input: s = "leetcode"
// Output: 0

// Algorithm

/*
 * Create an integer array of length 26
 * Traverse through string and append the value of every character in integer array calaculating their frequency
 * Again Traverse from 0 to length of string but this time though Integer array
 * Check frequency of every character of string by taking index of character in array
 * If frequencty is 1 make found = that index and break
 * if nothing found found = -1 as per initialized
 */

/*====================================================================================================== */

import java.util.Scanner;

class Solution {
    public int firstUniqChar(String s) {
        int found = -1;

        int[] arr = new int[26];

        for (int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }

        for (int i=0;i<s.length();i++)
        {
            if (arr[s.charAt(i)-'a']==1) {found = i;break;}
        }

        return found;
    }
}

public class First_Unique_Character_in_a_String {
    
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        scan.close();

        Solution sol = new Solution();

        int value = sol.firstUniqChar(s);

        System.out.println(value);


    }
}
