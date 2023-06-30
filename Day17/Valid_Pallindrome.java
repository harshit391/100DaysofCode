import java.util.Scanner;

// Leetcode Problem 125

// Valid Palindrome

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.


// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

// Algorithm

/**
 * Convert String to Lower case
 * Create a String builder sb for mutable string
 * Traverse through string and add only valid character to sb
 * Traverse though half sb and check the character from start and end simultaneously
 * if any one character is different return false otherwise true
 * END
 */


class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)>='a' && s.charAt(i)<='z') sb.append(s.charAt(i));
            else if (s.charAt(i)>='0' && s.charAt(i)<='9') sb.append(s.charAt(i));
        }

        for (int i=0;i<sb.toString().length()/2;i++)
        {
            if (sb.charAt(i)!=sb.charAt(sb.toString().length()-i-1))
            return false;
        }

        return true;
    }
}

public class Valid_Pallindrome {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        scan.close();

        Solution sol = new Solution();

        System.out.println(sol.isPalindrome(s));
    }
}
