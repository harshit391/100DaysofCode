package Day38;

import java.util.ArrayList;
import java.util.List;

// Leetcode Problem 448 

// Find All Numbers Disappeared in an Array

// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

// My Solution
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/solutions/3795402/beats-86-easy-java-solution/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Create an array result to store te resultant values
        List<Integer>ans=new ArrayList<>();

        // Create a boolean array to store the presence of numbers in array
        boolean[] present = new boolean[nums.length+1];

        for(int val : nums)
        {
            // Set the presence of element in nums to true
            present[val] = true;
        }


        for(int i=1;i<=nums.length;i++)
        {
            // if Number's presence is false in boolean array add element at that index to ArrayList
            if(!present[i])
            {
                ans.add(i);
            }
        }

        
        return ans;
    }
}

public class Find_All_Numbers_Disappeared_in_Array {
    
}
