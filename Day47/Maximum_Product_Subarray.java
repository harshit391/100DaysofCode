package Day47;

// Leetcode Problem 152 

// Maximum Product Subarray

// Given an integer array nums, find a subarray that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.

// Example 1:

// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.

// My Solution
// https://leetcode.com/problems/maximum-product-subarray/solutions/3838881/simple-solution-beats-100/

class Solution {
    public int maxProduct(int[] nums) {
        
        int curr = 1;
        int max = Integer.MIN_VALUE;

        for (int i=0;i<nums.length;i++)
        {
            curr*=nums[i];

            max = Math.max(max,curr);

            if (curr==0) curr = 1;
        }

        curr = 1;
        for (int i=nums.length-1;i>=0;i--)
        {
            curr *= nums[i];
            max = Math.max(max,curr);

            if (curr==0) curr = 1;
        }

        return max;
    }
}

public class Maximum_Product_Subarray {
    
}
