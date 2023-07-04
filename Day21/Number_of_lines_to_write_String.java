package Day21;

// Leetcode Problem 806

// Number of Lines to Write String

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

// Algorithm

/**
 * set number of lines to 1 and sum to 0
 * iterate through string and add widths of the respective characters from widths array to sum
 * check if we add next character width to sum is it becoming more than 100
 * If is it then set sum to 0 and increase number of lines by 1
 * At last add last character width to sum and create a result array of integers
 * append number of lines and sum to 0th and 1th index of result respectively
 * END
 */

/* =================================================================================================== */

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int number_of_lines = 1;
        int sum = 0;

        for (int i=0;i<s.length()-1;i++)
        { 
            sum += widths[s.charAt(i) - 'a'];
            if (sum + widths[s.charAt(i+1) - 'a']>100) 
            {
                number_of_lines += 1; 
                sum = 0;
            }
        }

        sum += widths[s.charAt(s.length()-1) - 'a'];

        int[] result = new int[2];

        result[0] = number_of_lines;
        result[1] = sum;

        return result;


    }
}

public class Number_of_lines_to_write_String {
    
}
