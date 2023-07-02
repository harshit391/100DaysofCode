package Day19;

import java.util.Scanner;

// Leetcode Problem 482

// Licence Key Formatting

// You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. The string is separated into n + 1 groups by n dashes. You are also given an integer k.

// We want to reformat the string s such that each group contains exactly k characters, except for the first group, which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.

// Return the reformatted license key.

// Example 1:

// Input: s = "5F3Z-2e-9-w", k = 4
// Output: "5F3Z-2E9W"
// Explanation: The string s has been split into two parts, each part has 4 characters.
// Note that the two extra dashes are not needed and can be removed.

/**
 * Create a string Builder for mutable String
 * Initialize the temp to 0 to use it to insert dash
 * Create a while loop starting from length of string to 0
 * if character at i is not dashed then insert character at that index in a string to string builder
 * increment temp to 1
 * once temp is equal to k insert dash to string builder
 * At Last Check if result length reamined 0 then return emplty string
 * else checkif string builder first character is a dash then delete it
 * Return the convert String builder to string and to uppercase
 * END
 */

/* ======================================================================================================= */

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder result = new StringBuilder("");

        int i = s.length()-1;

        int temp = 0;

        while(i>=0)
        {
            
            if (s.charAt(i)!='-') 
            {
                result.insert(0,s.charAt(i));
                temp++;
            }
            if (temp==k)
            {
                result.insert(0,'-');
                temp = 0;
            }
            i--;
        }

        if (result.length()==0) return "";
        
        if (result.charAt(0)=='-') result.delete(0,1);

        

        return result.toString().toUpperCase();




    }
}

public class Licence_Key_Formatting {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String k = scan.next();

        int m = scan.nextInt();

        scan.close();

        Solution sol = new Solution();

        System.out.println(sol.licenseKeyFormatting(k, m));
    }
}
