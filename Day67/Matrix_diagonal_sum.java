package Day67;

// Leetcode Problem 1572 

// Matrix Diagonal Sum

// Given a square matrix mat, return the sum of the matrix diagonals.

// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

// Example 1:

// Input: mat = [[1,2,3],
//               [4,5,6],
//               [7,8,9]]
// Output: 25
// Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
// Notice that element mat[1][1] = 5 is counted only once.

// My Solution
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i=0;i<mat.length;i++)
        {
            int j = mat.length - i - 1;
            sum += mat[i][i];
            sum += mat[i][j];
        }

        if (mat.length%2!=0)
        sum -= mat[mat.length/2][mat.length/2];

        return sum;

    }
}

public class Matrix_diagonal_sum {
    
}
