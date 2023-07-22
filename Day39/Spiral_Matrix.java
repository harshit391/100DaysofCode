package Day39;

import java.util.ArrayList;
import java.util.List;

// Leetcode Problem 54 

// Spiral Matrix

// Given an m x n matrix, return all elements of the matrix in spiral order.

// Example 1:

// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]

// My Solution
// https://leetcode.com/problems/spiral-matrix/solutions/3799263/beats-100-java-solution/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int a = 0; // Traverse from left to right
        int b = matrix[0].length; // Traverse from right to left
        int c = 0; // Traverse from up to down
        int d = matrix.length; // Traverse from down to up

        while (d>a && b>c) {
            
        for (int i=a;i<b;i++)
        {
            // Adding values from left to right
            ans.add(matrix[a][i]);
        }
        a++;

        for (int i=a;i<d;i++)
        {
            // Adding values from up to down
            ans.add(matrix[i][b-1]);
        }
        b--;

        if (a<d) { 
        for (int i=b-1;i>=c;i--)
        {
            // Adding values from right to left
            ans.add(matrix[d-1][i]);
        }
        d--;}

        if (c<b) {
        for (int i=d-1;i>=a;i--)
        {
            // Adding values from down to up
            ans.add(matrix[i][c]);
        }
        c++;}
        }

        return ans;


    }
}

public class Spiral_Matrix {
    
}
