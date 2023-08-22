package Day70;

// Leetcode Problem 287 

// Find the Duplicate Number

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.

// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2

class Solution {

    public int findDuplicate(int[] nums) {
        
        int i=0;
        while (i<nums.length)
        {
            if (nums[i]!=i+1) {
            int correct = nums[i]-1;
            if (nums[i]!=nums[correct])
            {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else return nums[i];
            } else i++;
        }

        return -1;
    }
}

public class Find_the_Duplicate_Number {
    
}
