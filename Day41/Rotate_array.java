package Day41;

// Leetcode Problem 189 

// Rotate Array

// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]

// My Solution
// https://leetcode.com/problems/rotate-array/solutions/3807975/beats-100-simple-java-solution/

class Solution {
    public void reverse(int[] nums, int idx1, int idx2)
    {
        while (idx1<idx2)
        {
            // Replace first and end element while interating
            int temp = nums[idx1];
            nums[idx1] = nums[idx2];
            nums[idx2] = temp;

            idx1++;
            idx2--;
        }
    }

    public void rotate(int[] nums, int k) {

        // Check if the rotation will be done right such that
        // if nums length is 4 and k = 4 
        // then after rotations the array will be same but time will be more
        // To avoid that decrease make k as modulus of length of input array
        k%=nums.length;
        
        // Reverse full array
        reverse(nums,0,nums.length-1);

        // Reverse the result array from start to k-1 index
        reverse(nums,0,k-1);

        // Reverse the result array from k to start index
        reverse(nums,k,nums.length-1);


    }
}

public class Rotate_array {
    
}
