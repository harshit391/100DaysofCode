package Day33;

import java.util.Arrays;

// Leetcode Problem 628 

// Maximum Product of Three Numbers

// Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

// Example 1:

// Input: nums = [1,2,3]
// Output: 6

// My Solution
// https://leetcode.com/problems/maximum-product-of-three-numbers/solutions/3774309/very-easy-to-understand-solution-java/

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        long product = nums[0]*nums[1]*nums[2];

        if (nums[0]<0 && nums[1]<0) 
        {
            if (product<nums[0]*nums[1]*nums[nums.length-1])
            {
                product = nums[0]*nums[1]*nums[nums.length-1];
            }
        }

        if (product<nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3])
        {
            product = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        }

        return (int)product;

    }
}

public class Maximum_product_of_Three_Numbers {
    
}
