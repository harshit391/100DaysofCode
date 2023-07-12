package Day29;

// Leetcode Problem 81 

// Search in Rotated Sorted Array II

// There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

// Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

// Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

// You must decrease the overall operation steps as much as possible.

// Example 1:

// Input: nums = [2,5,6,0,0,1,2], target = 0
// Output: true

// For More Details 
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/solutions/3754916/divide-and-conquer-approach-with-binary-search/

class Solution {
    public boolean partitionsearch(int[] nums, int index1,int index2, int target)
    {
        int low = index1;
        int high = index2;

        while (low<=high)
        {
            int mid = low + (high-low)/2;

            if (target==nums[mid]) return true;

            if (target<nums[mid]) high = mid-1;

            else low = mid + 1;
        }

        return false;
    }

    public boolean search(int[] nums, int target) {

        int minimum = 0;

        for (int i=nums.length-1;i>=1;i--)
        {
            if (nums[i-1]<=nums[i]) continue;

            else {minimum = i;break;}
        }

        return (partitionsearch(nums,0,minimum-1,target) || partitionsearch(nums,minimum,nums.length-1,target));
    }
}

public class Search_in_Rotated_Array_II{
    
}
