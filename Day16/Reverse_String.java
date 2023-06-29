package Day16;

// Leetcode Problem 344

// Reverse String 

// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.


// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

// Algorithm

/**
 * Traverse through character array to the half
 * Replace the elements of array one by one but to the half without creating a new array 
 * In place to be Say by Temp Variable as O(1) extra memory 
 * Print the Character array
 * END
 */

import java.util.Scanner;

class Solution {
    public void reverseString(char[] s) {
        
        for (int i=0;i<s.length/2;i++)
        {
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }

        System.out.println(s);
        
         
    }
}

public class Reverse_String {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        scan.close();

        char[] k = s.toCharArray();

        Solution sol = new Solution();

        sol.reverseString(k);
        
    }
}
