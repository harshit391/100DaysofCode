package Day19;

import java.util.Scanner;

// Leetcode Problem 434

// Given a string s, return the number of segments in the string.

// A segment is defined to be a contiguous sequence of non-space characters.

// Example 1:

// Input: s = "Hello, my name is John"
// Output: 5
// Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]

// Algorithm

/**
 * Trim the original String
 * If length of string remained is zero return 0
 * else split the string by using regex 
 * return remaining string length
 * END
 */

 /* ================================================================================================== */
class Solution {
    public int countSegments(String s) {

        s = s.trim();
        if (s.length()==0) return 0;
        String[] p = s.split("[ ]+");

        return p.length;

    }
}

public class Number_of_Segments_in_a_String {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        scan.close();

        Solution sol = new Solution();

        System.out.println(sol.countSegments(s));
    }
}
