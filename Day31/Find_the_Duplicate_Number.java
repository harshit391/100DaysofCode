package Day31;

import java.util.HashSet;
import java.util.Set;

// Leetcode Problem 287 

// Find the Duplicate Number

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.

// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2

// My Solution
// 

class Solution {
    public int findDuplicate(int[] nums) {
        
        Set<Integer> temp = new HashSet<>();

        for (int i=0;i<nums.length;i++)
        {
            if (temp.contains(nums[i]) && nums[i]!=0) return nums[i]; 
            temp.add(nums[i]);
        }

        return 0;
    }
}

public class Find_the_Duplicate_Number {
    
}
