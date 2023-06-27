/*Leetcode Problem 12 */

// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

// Example 1:

// Input: num = 3
// Output: "III"
// Explanation: 3 is represented as 3 ones.


// Algorithm

/**
 * Create a integer array having all the roman values
 * Creating a String array of their symbols on their corresponding indexes
 * make a string builder for mutable string
 * Create a look in which string got appended as it will find its values
 * decrement values from number
 * Convert the string builder to String
 * End
 */

/* ============================================================================================================================ */

import java.util.Scanner;

class Solution {

    public String IntegertoRoman(int num) {

    /*Creating an integer array having all the roman integer values */    
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    /*Making a String Array of all the Roman Symbols */
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX","V", "IV", "I"};

    /*For the easy way using string building so we can create a mutable string */
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < values.length; i++) {
        /* Now It will automatically equate the values is >1000 or <500 
         * Just How Great it is right 
        */
        while (num >= values[i]) {
            sb.append(symbols[i]); // Appending the values by magic of string builder
            num -= values[i]; //decrementing the number by values as it is finding
        }
    }

    return sb.toString(); // Converting Stringbuilder to String lol little ironical isn't it

    }
}


public class InttoRoman{ 
public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();

        scan.close();

        Solution sol = new Solution();

        String integer_value = sol.IntegertoRoman(s);

        System.out.println(integer_value);


    }
}