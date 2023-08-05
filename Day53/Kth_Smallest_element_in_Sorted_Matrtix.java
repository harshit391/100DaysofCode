package Day53;

// Leetcode Problem 378 

// Kth Smallest Element in a Sorted Matrix

// Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.

// Note that it is the kth smallest element in the sorted order, not the kth distinct element.

// You must find a solution with a memory complexity better than O(n2).

// Example 1:

// Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
// Output: 13
// Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13

// My Solution
// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/solutions/3867764/beats-100-binary-seach-approach/

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Binary search on the range of elements in the matrix
        int left = matrix[0][0];
        int right = matrix[rows - 1][cols - 1];

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = countLessOrEqual(matrix, mid, rows, cols);

            if (count < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    // Helper function to count the number of elements less than or equal to target in the matrix
    private int countLessOrEqual(int[][] matrix, int target, int rows, int cols) {
        int count = 0;
        int row = rows - 1;
        int col = 0;

        while (row >= 0 && col < cols) {
            if (matrix[row][col] <= target) {
                count += row + 1; // All elements in this column up to the current row are less than or equal to the target
                col++;
            } else {
                row--;
            }
        }

        return count;
    }
}

public class Kth_Smallest_element_in_Sorted_Matrtix {
    
}
