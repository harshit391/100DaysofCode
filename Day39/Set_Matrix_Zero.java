package Day39;

// Leetcode Problem 73 

// Set Matrix Zeroes

// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

// You must do it in place.

// Example 1:


// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]

// My Solution
// https://leetcode.com/problems/set-matrix-zeroes/solutions/3801527/brute-force-technique-beats-75-java/

class Solution {
    public void row_zero(int[][] matrix, int row)
    {
        for (int i=0;i<matrix[row].length;i++) {
        matrix[row][i] = 0;
        }
    }

    public void column_zero(int[][] matrix, int column)
    {
        for (int i=0;i<matrix.length;i++) {
        matrix[i][column] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {

        int[][] temp = new int[matrix.length][matrix[0].length];

        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                temp[i][j] = matrix[i][j];
            }
        }

        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                if (matrix[i][j]==0)
                {
                    row_zero(temp,i);
                    column_zero(temp,j);
                }  
            }
        }

        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j] = temp[i][j];
            }
        }

        

    }
}

public class Set_Matrix_Zero {
    
}
