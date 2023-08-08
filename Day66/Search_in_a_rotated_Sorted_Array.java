package Day66;

// Leetcode Problem 33 

// Search in Rotated Sorted Array

// There is an integer array nums sorted in ascending order (with distinct values).

// Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4

// My Solution
// https://leetcode.com/problems/search-in-rotated-sorted-array/solutions/3786041/simple-two-pointers-beats-100/

class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;

        while (low<=high)
        {
            if (nums[low]==target) return low;

            else if (nums[high]==target) return high;

            low++;
            high--;
        }

        return -1;

    }
}

public class Search_in_a_rotated_Sorted_Array {
    
}
