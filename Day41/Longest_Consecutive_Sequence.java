package Day41;

import java.util.Arrays;

// Leetcode Problem 128 

// Longest Consecutive Sequence

// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

// My Solution
// https://leetcode.com/problems/longest-consecutive-sequence/solutions/3807917/beats-98-simplest-java-solution/

class Solution {
    public int longestConsecutive(int[] nums) {
 
        // If length of nums is 0 return 0 immediately
        if (nums.length==0) return 0;
        
        // Sort the array 
        Arrays.sort(nums);

        // Track count of sequence by count variable
        int count=0;

        // Track Longest consecutive sequence by maxcount
        int maxcount = 0;

        for (int i=0;i<nums.length-1;i++)
        {
            // If difference between two elements is 1 then increase the count
            if (nums[i]==nums[i+1]-1) count++;

            // Else If both elements are equal just continue not update anything
            else if (nums[i]==nums[i+1]) continue;

            // Else Update maxcount if count is more than current maxcount and set count to 0
            else 
            {
                maxcount = (maxcount<count) ? count : maxcount;
                count = 0;
            }
        }

        // Update the maxcount with the greater value between maxcount and count
        maxcount = (maxcount<count) ? count : maxcount;

        // return maxcount incremented by 1
        return maxcount+1;
    }
}

public class Longest_Consecutive_Sequence {
    
}
