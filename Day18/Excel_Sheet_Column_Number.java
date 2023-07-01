package Day18;

// Leetcode Problem 171

// Excel Sheet Column Number

// Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

// For example:

// A -> 1
// B -> 2
// C -> 3
// ...
// Z -> 26
// AA -> 27
// AB -> 28 
// ...
 

// Example 1:

// Input: columnTitle = "A"
// Output: 1

// Algorithm

/**
 * Initialize a double type number to 0
 * Reverse Traverse the string
 * make a variable n which convert the character at index into number representation given 
 * Like A = 1, Z = 26
 * Now Multiply the the variable n with 26 to the power number of iterations 
 * and Add it to the number
 * Convert Number to Integer
 * END
 */

/* =============================================================================================== */

import java.util.Scanner;

class Solution {

    public int titleToNumber(String columnTitle) {

        double number  = 0;

        for (int i=columnTitle.length()-1;i>=0;i--)
        {
            int n = (int)(columnTitle.charAt(columnTitle.length()-1-i) - 'A' + 1);
            number += n*Math.pow(26,i);
        }

        return (int)number;
    }
}

public class Excel_Sheet_Column_Number {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        String m = scan.next();

        scan.close();

        Solution sol = new Solution();

        System.out.println(sol.titleToNumber(m));
    }   
}
