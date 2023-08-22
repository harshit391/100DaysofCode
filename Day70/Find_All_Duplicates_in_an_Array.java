package Day70;

import java.util.ArrayList;
import java.util.List;

// Leetcode Problem 442 

// Find All Duplicates in an Array

// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

// You must write an algorithm that runs in O(n) time and uses only constant extra space.

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;

        List<Integer> ans = new ArrayList<>();

        while (i<nums.length)
        {
            int correct = nums[i]-1;
            if (nums[i]!=nums[correct])
            {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else i++;
        }

        for (i=0;i<nums.length;i++)
        {
            if (nums[i]!=i+1) ans.add(nums[i]);
        }

        return ans;
    }
}

public class Find_All_Duplicates_in_an_Array {
    
}
