package Day27;

import java.util.HashSet;
import java.util.Set;

// Leetcode Problem 41

// First Missing Positive

// Given an unsorted integer array nums, return the smallest missing positive integer.

// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

// Example 1:

// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.

// For Algorithm hold control and Clink the link below
// https://leetcode.com/problems/first-missing-positive/solutions/3744814/very-easy-solution-using-set/

class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> result = new HashSet<>();

        for (int a:nums)
        {
            result.add(a);
        }

        for (int i=1;i<=result.size()+1;i++)
        {
            if (!result.contains(i)) return i;
        }

        return nums[0] + 1;
    }
}

public class First_Missing_Positive {
    
}
