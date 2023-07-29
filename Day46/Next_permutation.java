// Leetcode Problem 31 

// Next Permutation

// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

// For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
// The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

// For example, the next permutation of arr = [1,2,3] is [1,3,2].
// Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
// While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
// Given an array of integers nums, find the next permutation of nums.

// The replacement must be in place and use only constant extra memory.

// Example 1:

// Input: nums = [1,2,3]
// Output: [1,3,2]

// My Solution
// https://leetcode.com/problems/next-permutation/solutions/3834302/beats-100-java-solution/

class Solution {
    public void swap(int[] nums, int i, int j) {
        // To swap the values in nums array in place
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        // Reverse the array from specific index to end of array
        int end = nums.length-1;
        while(start < end) {
            swap(nums, start, end);
            start += 1;
            end -= 1;
        }
    }

    public void nextPermutation(int[] nums) {
        // Start from 2nd last element in array as we have to check last element with last 2nd
        int i = nums.length-2;
        while(i>=0 && nums[i] >= nums[i+1]) {
            // if element is larger than its aftermath element in array then decrease the i by 1
            // We have to check for maximum element from end everytime we have to create a new permutation 
            i -= 1;
        }
        
        if(i>=0) {
            // Now Start from end of the array after we have found the max elemen's (from end of array) index in form of i
            int j = nums.length-1;
            while(j>=0 && nums[j] <= nums[i]) {
                // Now find the greatest min element than nums[i] from end of array
                j -= 1;
            }
            // Swap the max element from end of array by greatest min element from end of array
            swap(nums, i, j);
        }
        // Reverse the array from i+1 index 
        reverse(nums, i+1);
    }
}

public class Next_permutation {
    
}
