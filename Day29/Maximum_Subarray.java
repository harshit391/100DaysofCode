package Day29;

// Leetcode Problem 53 

// Maximum Subarray

// Given an integer array nums, find the  subarray with the largest sum, and return its sum.

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

// More Details
// https://leetcode.com/problems/maximum-subarray/solutions/3754751/easy-kadane-algorithm/

class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0;i<nums.length;i++)
        {
            curr+=nums[i];

            max = Math.max(curr,max);

            if (curr<0) curr=0;
        }

        return max;
    }
}

public class Maximum_Subarray {
    
}
