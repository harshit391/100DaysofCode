package Day36;

// Leetcode Problem 34 

// Find First and Last Position of Element in Sorted Array

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// My Solution
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/solutions/3786511/simplest-binary-search-beginner-beats-100/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1}; 

        int low = 0;
        int high = nums.length-1;

        while (low<=high)
        {
            if (nums[low]==target) 
            {
                result[0] = low;
                break;
            }

            if (nums[high]==target) 
            {
                result[1] = high;
                break;
            }

            low++;
            high--;
        }

        if (result[0]==-1)
        {
        while(low<=high)
        {
            if (nums[low]==target)
            {
                result[0] = low;
                break;
            }
            low++;
        }
        }
        else
        {
        while(high>=low)
        {
            if (nums[high]==target)
            {
                result[1] = high;
                break;
            }
            high--;
        }
        }

        

        return result;


    }
}

public class Find_the_first_and_Last_postion_in_array {
    
}
