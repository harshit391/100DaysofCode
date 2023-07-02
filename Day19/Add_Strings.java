package Day19;

import java.util.Scanner;

// Leetcode Problem 415

// Add Strings 

// Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

// You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

// Example 1:

// Input: num1 = "11", num2 = "123"
// Output: "134"

// Algorithm

/**
 * Create a mutable String sb using String Builder
 * Now Initalize i and j to one less then num1 and num2 length respectively
 * Initialize a carry int variable to 0
 * Iterate by while loop till when both i and j become zero completely
 * Create a sum variable inside loop equal to carry 
 * Now if i is greater than zero convert the ith character of num1 to number and add it to sum
 * Similarly is j is greater than zero convert the ith character of num2 to number and add it to sum
 * Add the result to sb as sum modulus 10 to only get ones place integer like "1" from "21"
 * Make carry equal sum divided by 10 as we visulize in normal maths
 * Decrement i and j
 * At last if any carry remains add it to string sb
 * Convert the String Builder to String
 * END
 */

/* ==================================================================================================================================== */
class Solution {
    public String addStrings(String num1, String num2) {

        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();


        while (i>=0 || j>=0)
        {
            int sum = carry;
            if (i>=0) sum += num1.charAt(i) - '0';

            if (j>=0) sum += num2.charAt(j) - '0';

            sb.append(sum%10);
            carry = sum/10;

            i--;
            j--;

        }

        if (carry!=0) sb.append(carry);

        return sb.reverse().toString();

        

    }
}

public class Add_Strings {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String r1 = scan.next();

        String r2 = scan.next();

        scan.close();

        Solution sol = new Solution();

        System.out.println(sol.addStrings(r1, r2));
    }
}
