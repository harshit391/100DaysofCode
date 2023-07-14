package Day31;

import java.util.Arrays;

// Leetcode Problem 16 

// 3Sum Closest

// Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

// Example 1:

// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

// My Solution
// https://leetcode.com/problems/3sum-closest/solutions/3764710/three-pointers-approach/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        int closest = nums[0]+nums[1]+nums[2];

        for (int i=0;i<nums.length;i++)
        {
            int idx1 = i+1;
            int idx2 = nums.length-1;
            while (idx1<idx2)
            {
                sum = nums[i]+nums[idx1]+nums[idx2];
                if (Math.abs(target-sum) < Math.abs(target - closest))
                {
                    closest = sum;
                }
                if (sum<target)
                {
                    idx1++;
                }
                else
                {
                    idx2--;
                }
            }
        }

        return closest;

        
    }
}

public class ThreeSum_Closest{

}