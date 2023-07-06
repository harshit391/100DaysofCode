package Day23;

// Leetcode Problem 26

// Remove Duplicate from Sorted Array

// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
// Return k.
// Custom Judge:

// The judge will test your solution with the following code:

// int[] nums = [...]; // Input array
// int[] expectedNums = [...]; // The expected answer with correct length

// int k = removeDuplicates(nums); // Calls your implementation

// assert k == expectedNums.length;
// for (int i = 0; i < k; i++) {
//     assert nums[i] == expectedNums[i];
// }
// If all assertions pass, then your solution will be accepted.

 

// Example 1:

// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).

// Algorithm

/**
 * create a frequency array of length 201
 * as java not support negetive indexing so we count the frequency by adding the value in array by 100
 * Like index for -100 value becomes 0
 * and we can check the frequency later on by decreasing index by 100
 * In this way count unique elements and return the count
 * END
 */

/* =============================================================================================== */


class Solution {

    public int removeDuplicates(int[] nums) {
       int[] frequency = new int[201];

       for (int i=0;i<nums.length;i++)
       {
           frequency[nums[i]+100]++;
       }

       int index = 0;

       for (int i=0;i<201;i++)
       {
           if (frequency[i]>0)
           {
               nums[index] = i-100;
               index++;
           }
       }

       return index;
       
    }
}

public class Remove_Duplicate_from_Sorted_Array {
    
}
