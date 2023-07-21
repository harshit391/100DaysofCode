package Day38;

// Leetcode Problem 806 

// Number of Lines To Write String

// You are given a string s of lowercase English letters and an array widths denoting how many pixels wide each lowercase English letter is. Specifically, widths[0] is the width of 'a', widths[1] is the width of 'b', and so on.

// You are trying to write s across several lines, where each line is no longer than 100 pixels. Starting at the beginning of s, write as many letters on the first line such that the total width does not exceed 100 pixels. Then, from where you stopped in s, continue writing as many letters as you can on the second line. Continue this process until you have written all of s.

// Return an array result of length 2 where:

// result[0] is the total number of lines.
// result[1] is the width of the last line in pixels.
 

// Example 1:

// Input: widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "abcdefghijklmnopqrstuvwxyz"
// Output: [3,60]
// Explanation: You can write s as follows:
// abcdefghij  // 100 pixels wide
// klmnopqrst  // 100 pixels wide
// uvwxyz      // 60 pixels wide
// There are a total of 3 lines, and the last line is 60 pixels wide.

// My Solution
// https://leetcode.com/problems/number-of-lines-to-write-string/solutions/3795804/beats-100-easy-java-solution/

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int number_of_lines = 1; // Set number of lines to 1 initially
        int sum = 0; // Set sum to 0 initially

        for (char k : s.toCharArray())
        { 
            // Check if sum of previous sum and upcoming width is less than or equal to zero
            if (sum+widths[k-'a']<=100) 
            {
                // If yes add the width of that character to sum
                sum+=widths[k-'a'];
            }
            else 
            {
                // Else increment the number of lines by 1
                number_of_lines++;

                // Update sum by current character width
                sum = widths[k-'a'];
            }
            
        }

        // Create an array of resultant number of lines and resultant sum and return it
        return new int[] {number_of_lines,sum};


    }
}

public class Number_of_Lines_to_Write_String {
    
}
