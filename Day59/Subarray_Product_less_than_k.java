package Day59;

// Leetcode Problem 713 

// Subarray Product Less Than K

// Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

// Example 1:

// Input: nums = [10,5,2,6], k = 100
// Output: 8
// Explanation: The 8 subarrays that have product less than 100 are:
// [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
// Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.

// My Solution
// https://leetcode.com/problems/subarray-product-less-than-k/solutions/3894042/beats-99-95-java-sliding-window/

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // Starting of Sliding Window
        int start = 0;

        // End Point of Sliding Window
        int end = 0;

        // Tracking the product of subarray
        int pro = 1;

        // To Track the sliding window length
        int exist = 0;

        if (k<=1) return 0;

        while (end<nums.length)
        {
            // Multiply element of array to pro
            pro*=nums[end];
            // If pro becomes larger or equal to k
            while (start<=end && pro>=k)
            {
                // Remove the multiplied numbers from pro by diving them 
                pro/=nums[start++];
            }
            // Keep tracking the Sliding window length with it
            exist+=(end-start+1);

            // Increment end by 1 always
            end++;
        }

        return exist;
    }
}

public class Subarray_Product_less_than_k {
    
}
