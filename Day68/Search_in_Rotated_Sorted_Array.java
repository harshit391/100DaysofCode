package Day68;

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
// https://leetcode.com/problems/search-in-rotated-sorted-array/solutions/3936532/beats-100-faster-and-efficient-binary-seach-solultion-pivot-method/

class Solution {
    public int bnr(int[] nums, int start, int end, int target)
    {
        // Normal Binary Search Algorithm

        while (start<=end)
        {
            int mid = start + (end-start)/2;

            if (nums[mid]>target) end = mid - 1;

            else if (nums[mid]<target) start = mid + 1;

            else return mid;
        }

        return -1;
    }

    public int pivot(int[] nums)
    {
        // What we are actually finding is the peak element in array
        // And there can be multiple cases

        int start = 0;
        int end = nums.length-1;

        // Only works is there is all elements unique
        while (start<=end)
        {
            int mid = start + (end-start)/2;

            // mid element is greater than mid+1 element
            // It clarifies that mid element is the peak element
            if (mid < end && nums[mid]>nums[mid+1])
            {
                return mid;
            }

            // mid-1 element is greater than mid element
            // Clarifies the peak element is at mid - 1
            if (mid > start && nums[mid]<nums[mid-1])
            {
                return mid - 1;
            }

            // Now if start element is more than equal to mid element
            // We have to decerease our searching window to mid - 1
            // As it says pivot lies in left side
            if (nums[start]>=nums[mid])
            {
                end = mid-1;
            }

            // Else it will lies in right side of mid
            else start = mid + 1;
        }

        return -1;
    }

    public int search(int[] nums, int target) {

        int mid = pivot(nums);

        // If array is not rotated just apply simple binary search
        if (mid==-1) return bnr(nums,0,nums.length-1,target);

        // If pivot is target return it
        if (nums[mid]==target) return mid;

        // If start of array is larger than target it means target lies in right side of pivot index
        if (nums[0]>target) return bnr(nums, mid+1, nums.length-1, target);

        // Else just return searching in left side of array
        return bnr(nums, 0, mid, target);
    }
}

public class Search_in_Rotated_Sorted_Array {
    
}
