package Day43;

// Leetcode Problem 334 

// Increasing Triplet Subsequence

// Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

// Example 1:

// Input: nums = [1,2,3,4,5]
// Output: true
// Explanation: Any triplet where i < j < k is valid.

// My Solution
// https://leetcode.com/problems/increasing-triplet-subsequence/solutions/3819500/beats-100-easiest-java-solution/

class Solution {
    public boolean increasingTriplet(int[] nums) {

        // Set an Integer to maximum value as num1
        int num1 = Integer.MAX_VALUE;

        // Set another Integer to maximum value as num2
        int num2 = Integer.MAX_VALUE;

        for (int k : nums)
        {
            // If a element is less than or equal to num1 update nums1 with that element
            if (k<=num1) 
            num1 = k;

            // If a element is less than or equal to num2 update nums2 with that element
            else if (k<=num2)
            num2 = k;

            // If the the next elements were more than num1 and num2 variable that means we have three pairs set up as three index as we need then return true
            else 
            return true;
        }

        // If nothing like that indexes were found return false at end
        return false;
    }
}

public class Increasing_Triplet_Sequence {
    
}
