package Day69;

import java.util.Arrays;

// Leetcode Problem 976 

// Largest Perimeter Triangle

// Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.

// Example 1:

// Input: nums = [2,1,2]
// Output: 5
// Explanation: You can form a triangle with three side lengths: 1, 2, and 2.

class Solution {
    public int largestPerimeter(int[] nums) {
        
       //Sorting the array.
        Arrays.sort(nums);  

        for(int i = nums.length - 1; i - 2 >= 0; i--) {
        //Checking whether the 3 sides meet the conditions of the triangle.     
        if(nums[i] < nums[i - 1] + nums[i - 2])
                return nums[i - 2] + nums[i - 1] + nums[i]; //Returning the perimeter.
        }
        return 0; //None triangle could be formed.
    }
}

public class Largest_perimeter_Triangle {
    
}
