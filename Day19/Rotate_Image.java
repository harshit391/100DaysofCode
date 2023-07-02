package Day19;

import java.util.*;

// Leetcode Problem 48

// Rotate Image

// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

// Example 1:

// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[7,4,1],[8,5,2],[9,6,3]]

// Algorithm

/**
 * First Transpose the Matrix 
 * Then Reverse elements in each row
 * And Its Done... Lol
 * END
 */

 /* ================================================================================================ */

class Solution {
    public void rotate(int[][] matrix) {
        for (int i=0;i<matrix[0].length;i++)
        {
            for (int j=0;j<=i;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;   
            }
        }

        for (int i=0;i<matrix[0].length;i++)
        {
            for (int j=0;j<matrix[0].length/2;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length-j-1];
                matrix[i][matrix[0].length-j-1] = temp;
            }
        }

        
        
    }
}

public class Rotate_Image{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number of Rows");
        int row = scan.nextInt();

        System.out.println("Enter Number of Columns");
        int column = scan.nextInt();

        int[][] matrix = new int[row][column];

        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }

        scan.close();

        Solution sol = new Solution();

        sol.rotate(matrix);


    }
}