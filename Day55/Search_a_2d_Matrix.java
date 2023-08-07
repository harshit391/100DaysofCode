package Day55;

// Leetcode Problem 74 

// Search a 2D Matrix

// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

// Example 1:

// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true

// My Solution
// https://leetcode.com/problems/search-a-2d-matrix/solutions/3754827/binary-seach-easy-solution/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int low_row = 0;
        int high_row = matrix.length-1;

        while (low_row<=high_row)
        {
            int mid = low_row + (high_row-low_row)/2;

            if (matrix[mid][0]==target) return true;

            if (matrix[mid][0]<target) low_row  = mid+1;

            else high_row = mid-1;
        }

        if (high_row<0) high_row = 0;

        int low = 0;
        int high = matrix[high_row].length-1;

        while (low<=high)
        {
            int mid = low + (high-low)/2;

            if (matrix[high_row][mid]==target) return true;

            if (matrix[high_row][mid]<target) low  = mid+1;

            else high = mid-1;
        }

        return false;

    }
}

public class Search_a_2d_Matrix {
    
}
