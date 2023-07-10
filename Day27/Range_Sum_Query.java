package Day27;

// Leetcode Problem 303 

// Range Sum Query - Immutable

// Given an integer array nums, handle multiple queries of the following type:

// Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
// Implement the NumArray class:

// NumArray(int[] nums) Initializes the object with the integer array nums.
// int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 

// Example 1:

// Input
// ["NumArray", "sumRange", "sumRange", "sumRange"]
// [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
// Output
// [null, 1, -1, -3]

// Explanation
// NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
// numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
// numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
// numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3

// For Algorithm Hold Control Key and Click the link below
// https://leetcode.com/problems/range-sum-query-immutable/solutions/3744606/easiest-solution-ever/

class NumArray {

    int sum_array[];

    public NumArray(int[] nums) {
        sum_array = new int[nums.length];
        
        for (int i=0;i<nums.length;i++)
        sum_array[i] = nums[i];
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;

        for (int i=left;i<=right;i++)
        sum+=sum_array[i];
        
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

public class Range_Sum_Query {
    
}
