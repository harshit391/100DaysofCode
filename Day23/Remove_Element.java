package Day23;

// Leetcode Problem 27

// Remove Element

// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// Return k.
// Custom Judge:

// The judge will test your solution with the following code:

// int[] nums = [...]; // Input array
// int val = ...; // Value to remove
// int[] expectedNums = [...]; // The expected answer with correct length.
//                             // It is sorted with no values equaling val.

// int k = removeElement(nums, val); // Calls your implementation

// assert k == expectedNums.length;
// sort(nums, 0, k); // Sort the first k elements of nums
// for (int i = 0; i < actualLength; i++) {
//     assert nums[i] == expectedNums[i];
// }
// If all assertions pass, then your solution will be accepted.

// Example 1:

// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 2.
// It does not matter what you leave beyond the returned k (hence they are underscores).

// Algorithm

/**Set a count num variable to count how many elements equal to val are present
 * Set an index variable to 0
 * iterate through nums array and if element equal to val increment count to 1
 * if not then replace nums[index] to value present at ith index of nums
 * return length of nums subtracted by count
 * END
 */

/* ======================================================================================= */


class Solution {
    public int removeElement(int[] nums, int val) {
        
        int count_num=0;
        int start_index = 0;

        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==val) count_num++;
            else 
            {
                nums[start_index] = nums[i];
                start_index++;
            }
        }

        return nums.length - count_num;

        
    }
}

public class Remove_Element {
    
}
