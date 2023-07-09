package Day26;

import java.util.Arrays;

// Leetcode Problem 414 

// Third Maximum Number

// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

// Example 1:

// Input: nums = [3,2,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2.
// The third distinct maximum is 1.

// For Algorithm Hold Control Key and Click on the Link Below
// https://leetcode.com/problems/third-maximum-number/solutions/3741474/very-easy-solution-using-simple-basics/

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        if (nums.length<=2) return nums[nums.length-1];

        int break_index = 0;
        int third_index = 0;
 
        for (int i=nums.length-1;i>=1;i--)
        {
            if (break_index == 3) break;
            if (nums[i]!=nums[i-1]) {third_index = i;break_index++;}
            System.out.println(break_index);
        } 

        if (break_index<2) return nums[nums.length-1];

        if (nums[third_index-1]<nums[third_index]) 
        {
            if (break_index==3) return nums[third_index];
            return nums[third_index-1];
        }

        return nums[third_index];


    }
}

public class Third_Maximum_Number {
    
}
