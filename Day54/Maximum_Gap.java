package Day54;

import java.util.Arrays;

// Leetcode Problem 164 

// Maximum Gap

// Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return 0.

// You must write an algorithm that runs in linear time and uses linear extra space.

// Example 1:

// Input: nums = [3,6,9,1]
// Output: 3
// Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.

// My Solution
// https://leetcode.com/problems/maximum-gap/solutions/3872012/beats-73-easy-solution-java/

class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;

        Arrays.sort(nums);

        int max =0;

        for (int i=0;i<nums.length-1;i++)
        {
            int k = nums[i+1]-nums[i];
            if (k>max) max = k;
        }

        return max;
    }
}

public class Maximum_Gap {
    
}
