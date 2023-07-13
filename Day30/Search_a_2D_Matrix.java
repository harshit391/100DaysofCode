package Day30;

// Leetcode Problem 240 

// Search a 2D Matrix II

// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.
 
// Example 1:

// Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
// Output: true

// My Solution 
// https://leetcode.com/problems/search-a-2d-matrix-ii/solutions/3759933/easy-solutions-using-two-pointers-approach/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

       int low = 0;
       int high = matrix[0].length-1;

       while (high>=0 && low<matrix.length)
       {
           if (target==matrix[low][high]) return true;

           else if (target<matrix[low][high]) high--;

           else low++;
       }

       return false;
    }
}

public class Search_a_2D_Matrix {
    
}
