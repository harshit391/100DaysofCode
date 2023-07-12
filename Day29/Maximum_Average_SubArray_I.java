package Day29;

// Leetcode Problem 643 

// Maximum Average Subarray I

// You are given an integer array nums consisting of n elements, and an integer k.

// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

// Example 1:

// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

// For More Details
// https://leetcode.com/problems/maximum-average-subarray-i/solutions/3754778/easy-sliding-window-solutions/

class Solution {

    public double findMaxAverage(int[] nums, int k) {

        double Sum = 0;
        double max = Integer.MIN_VALUE;

        for (int i=0;i<nums.length;i++)
        {
            Sum += nums[i];
            if (i>=(k-1))
            {
                double Average = Sum/k;
                max = Math.max(Average,max);
                Sum -= nums[i-(k-1)];
            }
        }

        return max;
    }
}

public class Maximum_Average_SubArray_I {
    
}
