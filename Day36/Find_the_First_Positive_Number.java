package Day36;

// Leetcode Problem 41 

// First Missing Positive

// Given an unsorted integer array nums, return the smallest missing positive integer.

// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

// Example 1:

// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.

// My Solution
// https://leetcode.com/problems/first-missing-positive/solutions/3787517/beating-100-java-solution/

class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        
        while (i<nums.length)
        {
            int check = nums[i]-1;
            if (nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[check])
            {
                int temp = nums[i];
                nums[i] = nums[check];
                nums[check] = temp;
            }
            else i++;
        }

        i=0;

        while (i<nums.length)
        {
            if (nums[i]!=i+1)
            return i+1;

            i++;
        }

        return nums.length+1;


    }
}

public class Find_the_First_Positive_Number {
    
}
