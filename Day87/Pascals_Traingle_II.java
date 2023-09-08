package Day87;

import java.util.*;

// Leetcode Problem 119 

// Pascal's Triangle II

// Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

// Example 1:

// Input: rowIndex = 3
// Output: [1,3,3,1]

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        long C = 1;
        for (int j=0;j<=rowIndex;j++)
        {
            result.add((int)C);
            C = C*(rowIndex-j)/(j+1);
        }

        return result;


    }
}

public class Pascals_Traingle_II {
    
}
