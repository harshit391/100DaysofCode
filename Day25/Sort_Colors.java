package Day25;

// Leetcode Problem 75

// Sort Colors

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Algorithm

/**
 * Count zeroes one and two by using three variables
 * Replace number of zeroes one and two one by one in nums array in place
 * END
 */

/* =============================================================================================== */

 class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        int index = 0;

        for (int i:nums)
        {
            if (i==0) zero++;
            if (i==1) one++;
            if (i==2) two++;
        }

        while(zero-->0) {nums[index] = 0;index++;}
        while(one-->0) {nums[index] = 1;index++;}
        while(two-->0) {nums[index] = 2;index++;}

        
    }
}

public class Sort_Colors {
    
}
