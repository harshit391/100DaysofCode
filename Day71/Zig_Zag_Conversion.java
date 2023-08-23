// Leetcode Problem 6 

// Zigzag Conversion

// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

// P   A   H   N
// A P L S I I G
// Y   I   R
// And then read line by line: "PAHNAPLSIIGYIR"

// Write the code that will take a string and make this conversion given a number of rows:

// string convert(string s, int numRows);
 

// Example 1:

// Input: s = "PAYPALISHIRING", numRows = 3
// Output: "PAHNAPLSIIGYIR"

// My Solution
// https://leetcode.com/problems/zigzag-conversion/solutions/3950566/beats-77-easy-java-solution/

class Solution {
    public String convert(String s, int numRows) {

        // Create a 2D String Builder of length numRows
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            // Inside that builder Create StringBuilder at every index
            sb[i] = new StringBuilder();
        }

        // Convert String to Char Array
        char[] ch = s.toCharArray(); 

        // To Track Char Array index
        int idx = 0;

        // Untill String end
        while (idx < s.length())
        {
            // First move in forward direction till numRows-1 and add values to a Single StringBuilder at ith index of 2D String Builder
            for (int i=0;i<numRows && idx<s.length();i++)
            {
                sb[i].append(ch[idx++]);
            }


            // Then Append values from numRows-2 to 1 index
            for (int i=numRows-2;i>0 && idx<s.length();i--)
            {
                sb[i].append(ch[idx++]);
            }
        }
        
        // Now Concatinate Strings at 0th index of 2D String Builder
        for (int i=1;i<numRows;i++)
        sb[0].append(sb[i].toString());

        // IT will result in Zig Zag conversion of String 
        return sb[0].toString();
    }
}

public class Zig_Zag_Conversion {
    
}
