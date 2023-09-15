package Day94;

// Leetcode Problem 34 

// Find First and Last Position of Element in Sorted Array

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// My Solution
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/solutions/4047256/binary-search-solution-java/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        int left = -1;
        int right = -1;

        while (low <= high)
        {
            int mid = low + (high-low)/2;

            if (nums[mid]==target) 
            {
                left = mid;
                high = mid-1;
            }

            else if (nums[mid]>target) high = mid-1;

            else low = mid + 1;
        }

        low = 0;
        high = nums.length-1;

        while (low <= high)
        {
            int mid = low + (high-low)/2;

            if (nums[mid]==target) 
            {
                right = mid;
                low = mid + 1;
            }

            else if (nums[mid]>target) high = mid-1;

            else low = mid + 1;
        }

        return new int[] {left,right};
    }
}

public class Find_First_and_Last_Position_in_Sorted_array {
    
}
