package Day15;

// Leetcode Problem 58

// Length of Last Word

// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal 
// substring
// consisting of non-space characters only.

// Example 3:

// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.

// Algorithm

/**
 * Firstly Trim the Original String
 * Now initialize a index which check where the space ended as -1
 * Now Reverse Traverse the string and check the index for first whitespace
 * As We get index Using substring create a substring with index+1 as one character after white space
 * because we get index for the white space not character
 * return the length of the created substring
 * END
 */

/*==================================================================================================== */

import java.util.Scanner;

class Solution {
    public int lengthOfLastWord(String s) {

        s = s.trim();
        int index = -1;

        for (int i=s.length()-1;i>=0;i--)
        {
            if (s.charAt(i)==' ') {index=i;break;}
        }

        String p = s.substring(index+1,s.length());

        return p.length();

    }
}


public class Length_of_Last_Word {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        scan.close();

        Solution sol = new Solution();

        int value = sol.lengthOfLastWord(s);

        System.out.println(value);
    }
}
