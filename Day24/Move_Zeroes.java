package Day24;

// Leetcode Problem 283

// Move Zeroes

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// Algorithm

/**
 * Using bubble sort we can shift the zeroes at end easily
 * END
 */

class Solution {
    public void moveZeroes(int[] nums) {
        for (int i=0;i<nums.length;i++)
        {
            for (int j=i+1;j<nums.length;j++)
            {
                if (nums[i]==0) 
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

public class Move_Zeroes {
    
}
