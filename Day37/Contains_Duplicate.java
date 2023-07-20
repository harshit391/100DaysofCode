package Day37;

import java.util.HashSet;
import java.util.Set;

// Leetcode 217 

// Contains Duplicate

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true

// My Solution
// https://leetcode.com/problems/contains-duplicate/solutions/3793462/beats-99-java-hashset-solution/

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> temp = new HashSet<>();

        for (int a : nums)
        {
            if (!temp.add(a)) return true;
        } 

        return false;

    }
}

public class Contains_Duplicate {
    
}
