package Day57;

// Leetcode Problem 209 

// Minimum Size Subarray Sum

// Given an array of positive integers nums and a positive integer target, return the minimal length of a 
// subarray
//  whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.

// My Solution
// https://leetcode.com/problems/minimum-size-subarray-sum/solutions/3885286/beats-99-96-java-solution/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // Sliding Window
        int start = 0;
        int end = 0;

        // To track minimum variable
        int min = Integer.MAX_VALUE;

        // TO track Sum
        int sum = 0;

        while (end < nums.length)
        {
            // Start adding element in sum from end index
            sum += nums[end];
            // Sum get greater than equal to target
            while (sum>=target)
            {
                // Track the minimum length achieved 
                // end - start + 1 is actually sliding window length at that point
                min = Math.min(min,end-start+1);

                // Subtract sum from start index with inceremnt start index untill sum got lesser than target
                sum -= nums[start++];
            }
            // increment the end by 1 at the end of inner loop
            end++;
        }

        // If our minimum doesn't get updated from Max value return 0 
        if (min==Integer.MAX_VALUE) return 0;

        // Else return the minimum length achieved by sliding window 
        return min;
       
    }
}

public class Minimum_Array_Subarray_Sum {
    
}
