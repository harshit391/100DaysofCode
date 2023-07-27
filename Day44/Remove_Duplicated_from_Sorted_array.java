package Day44;

// Leetcode Problem 80 

// Remove Duplicates from Sorted Array II

// Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

// Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

// Return k after placing the final result in the first k slots of nums.

// Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

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

// Input: nums = [1,1,1,2,2,3]
// Output: 5, nums = [1,1,2,2,3,_]
// Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).

// My Solution with Proper Example
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/solutions/3823748/beats-100-full-explanation-using-example-java/

class Solution {
    public int removeDuplicates(int[] nums) {
        
        // It counts the repeatition of an element in nums
        int count=0;

        // To check the element is being repeated
        int temp=nums[0];

        int n=nums.length;

        // To delete the elements in nums by shifting through this index
        int k=0;


        for(int i=0;i<n;i++){
            // If the element is equal to temp and count is less than 2 
            if(nums[i]==temp && count<2){

                // Update kth index element by ith index element with incementing k by 1
                nums[k++]=nums[i];

                // Increment count by 1
                count++;
            }

            // If element is not equal to temp 
            if(nums[i]!=temp){

                // Then update temp with that element
                temp=nums[i];

                // Reset count to 1
                count=1;

                // Update kth index element at that point to ith index element
                nums[k++]=nums[i];
            }
        }

          return k;
        }

    }

public class Remove_Duplicated_from_Sorted_array {
    
}
