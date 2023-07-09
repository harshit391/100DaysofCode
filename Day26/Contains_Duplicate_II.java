package Day26;

import java.util.HashSet;
import java.util.Set;

// Leetcode Problem 219 

// Contains Duplicate II

// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

// Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true

// For Algorithm Hold Control Key and Click on the link below
// https://leetcode.com/problems/contains-duplicate-ii/solutions/3741535/easiest-solution-using-set/

class Solution {
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> result = new HashSet<>();

        for (int i=0;i<nums.length;i++)
        {
            if (result.contains(nums[i]) && result.size()<=k) return true;

            if (result.size()>=k) result.remove(nums[i-k]);

            result.add(nums[i]);
        }

        return false;
    }
}

public class Contains_Duplicate_II {
    
}
