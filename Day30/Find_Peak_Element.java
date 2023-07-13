package Day30;

// Leetcode Problem 162 

// Find Peak Element

// A peak element is an element that is strictly greater than its neighbors.

// Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

// You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

// You must write an algorithm that runs in O(log n) time.

// Example 1:

// Input: nums = [1,2,3,1]
// Output: 2
// Explanation: 3 is a peak element and your function should return the index number 2.

// My Solution
// https://leetcode.com/problems/find-peak-element/solutions/3759984/easy-binary-seach-solution-two-pointers-approach-to-be-say/

class Solution {
    public int findPeakElement(int[] nums) {
        
        int low = 1;
        int high = nums.length-1;

        int maximum = 0;

        while (low<=high)
        {
            if (nums[maximum]<nums[low]) maximum = low;
            if (nums[maximum]<nums[high]) maximum = high;

            low++;
            high--;
        }

        return maximum;

    }
}

public class Find_Peak_Element {
    
}
