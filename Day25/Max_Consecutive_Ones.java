package Day25;

// Leetcode Problem 485 

// Max Consecutive Ones

// Given a binary array nums, return the maximum number of consecutive 1's in the array.

// Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

// Algorithm

/**
 * Set a maxcount to 0 and count to 0
 * traverse through nums array and if element equal to 1 increment count to 1
 * but if not set count to 0 again
 * And also keep updating maxcount to the max value count ever gone 
 * END
 */

/* =========================================================================================== */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = 0;
        int count = 0;

        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==1) count++;
            else count=0;

            maxcount = Math.max(maxcount,count);
        }   

        return maxcount;
    }
}

public class Max_Consecutive_Ones {
    
}
