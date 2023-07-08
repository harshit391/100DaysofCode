package Day25;

// Leetcode Problem 34 

// Find First and Last Position of Element in Sorted Array

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// Algorithm

/**
 * Initalize a result array with -1 and -1 on index 0 and 1
 * We are Using Two Pointers for this problem
 * set a low variable to 0 and high to one less than nums length
 * set two boolean as found low and found high to true 
 * Now start a while loop checking low is less than length of nums and high is more than zero 
 * if target is at low index and found low is true set 0th index of result to element at low index and set found low to false
 * Now low will not headed afterwards and helps in time reduction
 * Side by side check element from backwards using high 
 * if target is at high index set found high to false and 1st index of result to element at high index of nums
 * decrement high and increment low by 1 everytime 
 * END
 */

 /* =============================================================================================== */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1}; 

        int low = 0;
        int high = nums.length-1;
        boolean found_high = true;
        boolean found_low = true;

        while (low<nums.length && high>=0)
        {
            if (nums[low]==target && found_low) {result[0] = low;found_low=false;}
            if (nums[high]==target && found_high) {result[1] = high;found_high = false;}

            low++;
            high--;
        }

        

        return result;


    }
}

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    
}
