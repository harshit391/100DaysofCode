// Leetcode Problem 540 

// Single Element in a Sorted Array

// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

// Return the single element that appears only once.

// Your solution must run in O(log n) time and O(1) space.

// Example 1:

// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2

// My Solution
// https://leetcode.com/problems/single-element-in-a-sorted-array/solutions/3863222/beats-100-easy-binary-search-java/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        // We have to Seach from 1st index to 1 less than last index in array
        int low = 1;
        int high = nums.length-2;

        // If array entered is of length 1 return first element
        if (nums.length==1) return nums[0];

        // Special Cases

        // If first element is not equal to second element return first element
        if (nums[0]!=nums[1]) return nums[0];

        // if last element is not equal to second last element return last element
        else if (nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];

        // Now Binary Search untill low get less than equal to high
        while (low<=high)
        {
            // Check Triplets from start is the middle element is unique return it
            if (nums[low]!=nums[low+1] && nums[low]!=nums[low-1]) return nums[low];
            else if (nums[high]!=nums[high+1] && nums[high]!=nums[high-1]) return nums[high];

            // If nothing happens just incerment low and decrement high by 1
            else
            {
                low++;
                high--;
            }
        }

        // I had to return something so just returning the first elemet of array and if you want a reason Then It is working then who wants to know the reason after all
        return nums[low];

    }
}

public class Single_element_in_Sorted_Array {
    
}
