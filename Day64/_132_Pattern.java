package Day64;

// Leetcode Problem 456 

// 132 Pattern

// Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].

// Return true if there is a 132 pattern in nums, otherwise, return false.

// Example 1:

// Input: nums = [1,2,3,4]
// Output: false
// Explanation: There is no 132 pattern in the sequence.

// My Solution
// https://leetcode.com/problems/132-pattern/solutions/3917511/beats-97-71-java-solution/

class Solution {
    public boolean find132pattern(int[] nums) {

        // It is basically the 3 in 132 pattern that we are finiding
        int second=Integer.MIN_VALUE;

        //using nums itself as the stack (bottom on the right end)
        int index=nums.length; 

        // Reverse Iterating the array
        for(int i=nums.length-1;i>=0;i--){
            // At point nums[i] get less than second than we have successfully find 132 pattern
            if(nums[i]<second) return true;


            else 
            {
                // If like nums[index] is less than nums[i] then update second by nums[i]
                // Which basically tells that we found 3 of 132 
                while(index<nums.length && nums[i]>nums[index]) 
                second=nums[index++];
            }

            // at end always decrement the index and update value of nums[i] in nums at index
            nums[--index]=nums[i];
        }
        
        return false;
    }
}

public class _132_Pattern {
    
}
