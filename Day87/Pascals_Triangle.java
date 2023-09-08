package Day87;

import java.util.*;

// Leetcode Problem 118 

// Pascal's Triangle

// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i=1;i<=numRows;i++)
        {
            int C = 1;
            List<Integer> temp = new ArrayList<>();
            for (int j=1;j<=i;j++)
            {
                temp.add(C);
                C = C*(i-j)/j;

            }
            result.add(temp);
        }

        return result;
    }
}

public class Pascals_Triangle {
    
}
