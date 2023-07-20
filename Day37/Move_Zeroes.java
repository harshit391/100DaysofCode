package Day37;

// Leetcode Problem 283 

// Move Zeroes

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// My Solution
// https://leetcode.com/problems/move-zeroes/solutions/3793512/easy-solution-java-beats-100/

class Solution {
    public void moveZeroes(int[] nums) {
       int zeroes = 0;

       int start_index = 0;

       for (int i=0;i<nums.length;i++)
       {
           if (nums[i]==0) 
           {
               zeroes++;
           }
           else 
           {
               nums[start_index++] = nums[i];
           }
       }

       int end_index = nums.length-1;

       for (int i=0;i<zeroes;i++)
       nums[end_index--] = 0;
    }
}

public class Move_Zeroes {
    
}
