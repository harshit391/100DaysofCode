import java.util.Scanner;

// Leetcode Problem 14

// Longest Common Prefix 

// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".


// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// Algorithm

/**
 * Create a String builder sb for mutable string
 * Traverse from 0 to string array length 
 * Intialize flag to true before inner loop
 * Traverse the inner loop such that it check every two elements ith character
 * if any one character different flag = false
 * after inner loop if flaf is true append sb to the character which is common among all elements
 * else break the loop
 * return Convert String from sb
 * END
 */

 /* ==================================================================================================== */


class Solution {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder("");

        for (int i=0;i<strs.length;i++)
        {
            boolean flag  = true;
            for (int j=0;j<strs.length-1;j++)
            {
                if (strs[j].charAt(i)!=strs[j+1].charAt(i)) 
                {
                    flag = false;
                }
            }
            if (flag)
            sb.append(strs[0].charAt(i));
            else break;
        }

        return sb.toString();

    }
}

public class Longest_Common_Prefix {

    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        scan.close();

        String[] words = s.split(" ");

        Solution sol = new Solution();

        System.out.println(sol.longestCommonPrefix(words));

    }
}
