package Day18;

// Leetcode Problem 168

// Excel Sheet Column Title

// Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

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

// Input: columnNumber = 1
// Output: "A"

// Algorithm

/**
 * Create a string builder for mutable string
 * as there are 26 alphabets so just create a while loop where if number is more than 26 then it will enter the loop
 * Check if number is fully divisible by 26
 * Yes , Simply Insert Z at 0 index of string and decrease the number by 1
 * No, Add 64 to the remainder of number when divided by 26 and insert the character of that number
 * At last divide the number by 26
 * After Loop End insert the reamining number character added by 64 to the string
 * Convert String Builder to String
 * END
 */

/* ========================================================================================================================= */

import java.util.Scanner;

class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder("");

        while(columnNumber>26)
        {
            if (columnNumber%26==0) {
            sb.insert(0,(char)('Z'));
            columnNumber--;}

            else
            sb.insert(0,(char)(columnNumber%26 + 64 ));

            columnNumber/=26;
        }

        sb.insert(0,(char)(columnNumber+ 64));

        return sb.toString();

        
    }
}

public class Excel_Sheet_Column_Title {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();

        scan.close();

        Solution sol = new Solution();

        System.out.println(sol.convertToTitle(m));
    }
    
}
