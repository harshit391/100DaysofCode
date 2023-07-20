package Day37;

// Leetcode Problem 88 

// Merge Sorted Array

// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

// My Solution
// https://leetcode.com/problems/merge-sorted-array/solutions/3790618/merge-sort-approach-beats-100-java/

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;

        while(idx1 < m && idx2 < n)
        {
            if (nums1[idx1]<nums2[idx2]) 
            {
                result[idx3++] = nums1[idx1++];
            }
            else
            {
                result[idx3++] = nums2[idx2++];
            }
        }

        while (idx1<m)
        {
            result[idx3++] = nums1[idx1++];
        } 

        while (idx2<n)
        {
            result[idx3++] = nums2[idx2++];
        }

        int i = 0;
        for (int a : result)
        {
            nums1[i++] = a;
        }

    }
}

public class Merge_Sorted_Array {
    
}
