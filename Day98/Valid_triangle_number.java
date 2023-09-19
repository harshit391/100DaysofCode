package Day98;

// Leetcode Problem 611 

// Valid Triangle Number

// Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

// Example 1:

// Input: nums = [2,2,3,4]
// Output: 3
// Explanation: Valid combinations are: 
// 2,3,4 (using the first 2)
// 2,3,4 (using the second 2)
// 2,2,3

// My Solution
// https://leetcode.com/problems/valid-triangle-number/solutions/4064583/beats-93-easy-solution-two-pointers-java/

import java.util.Arrays;

class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;

        int ans = 0;
        // Sort the nums array
        Arrays.sort(nums);

        // Traverse from reverse
        for(int i=n-1; i>=0; i--){

            // We are actaully taking finding result between the minimum number and 2nd last number in array
            int a = 0;
            int b = i-1;

            // Between a and b
            while(a<b){
                // If sum of both numbers results more than the number at i th index 
                // That means its a valid combination
                // Add the window to answer
                if(nums[a]+nums[b]>nums[i]){
                    ans += (b-a);
                    // Decrement b
                    b--;
                }
                // If sum is less then increment a
                else a++;
            }
        }
        return ans;
    }
}

public class Valid_triangle_number {
    
}
