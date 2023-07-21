package Day38;

// Leetcode PRoblem 485 

// Max Consecutive Ones

// Given a binary array nums, return the maximum number of consecutive 1's in the array.

// Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

// My Solution
// https://leetcode.com/problems/max-consecutive-ones/solutions/3795453/beats-100-easy-solution/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = 0; // Set maxcount to 1 initially
        int count = 0; // Set count to 0 initially

        for (int a : nums)
        {
            // If element in nums is 1 increment the count
            if (a==1) count++;

            else 
            {
                // Else Set maxcount to maximum between count and maxcount
                maxcount = Math.max(maxcount,count);
                count=0; // Update count to 0
            }
        }   

        // return the maximum values between count and maxcount
        return Math.max(maxcount,count);
    }
}

public class Maximum_Consecutive_Ones {
    
}
