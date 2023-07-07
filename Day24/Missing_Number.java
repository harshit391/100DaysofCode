package Day24;

import java.util.Arrays;

// Leetcode Problem 268

// Missing number

// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

// Example 1:

// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

// Algorithm

/**
 * If length of nums is 0 return 0
 * Sort array by sort built in method 
 * if 0 is not at oth index of array then return 0
 * iterate through array and check the where the number is not present as sequence
 * return that number if there is no such number return last number of array added by 1
 * END
 */

/* ================================================================================================ */

class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length==0) return 0;  

        Arrays.sort(nums);

        if (nums[0]!=0) return 0; 

        for (int i=0;i<nums.length-1;i++)
        {
            if (nums[i]!=nums[i+1]-1) return nums[i]+1;
        }

        return nums[nums.length-1]+1;
    }
}

public class Missing_Number {
    
}
