package Day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Leetcode Problem 15 

// 3Sum

// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.

// My Solution
// https://leetcode.com/problems/3sum/solutions/3764726/three-pointers-approach/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> main = new HashSet<>();
        Arrays.sort(nums);

       for (int i=0;i<nums.length;i++)
       {
           int idx1 = i+1;
           int idx2 = nums.length-1;
           
           while (idx1<idx2)
           {
               if (nums[i]+nums[idx1]+nums[idx2]==0)
               {
                   main.add(Arrays.asList(nums[i],nums[idx1],nums[idx2]));
                   idx1++;
                   idx2--;
               } 
               else if (nums[i]+nums[idx1]+nums[idx2]<0)
               {
                   idx1++;
               }
               else 
               {
                   idx2--;
               }
           }
       }

        List<List<Integer>> result = new ArrayList<>();

        result.addAll(main);
        return result;


    }
}

public class ThreeSum {
    
}
