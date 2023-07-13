package Day30;

// Leetcode Problem 566

// Reshape the Matrix

// In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

// You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

// The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

// If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

// Example 1:

// Input: mat = [[1,2],[3,4]], r = 1, c = 4
// Output: [[1,2,3,4]]

// My Solution 
// https://leetcode.com/problems/reshape-the-matrix/solutions/3760030/easy-to-understand-solution/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int idx1 = 0;
        int idx2 = 0;

        if ((c*r)!=(mat.length*mat[0].length)) 
        {
            return mat;
        }
 
        int[][] result = new int[r][c];

        for (int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[i].length;j++)
            {
                result[idx1][idx2++] = mat[i][j];
                if (idx2==c)
                {
                    idx2 = 0;
                    idx1++;
                }
            }
        }

        return result;

    }
}

public class Reshape_the_Matrix {
    
}
