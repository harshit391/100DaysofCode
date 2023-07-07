package Day24;

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

// Algorithm

/**
 * Firstly merge the elements of nums2 in nums1 at the end
 * Then sort the elements by using a sorting technique 
 * You can use any I have used selection sort
 * END
 */

/* ================================================================================================ */

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

       for (int i=0;i<n;i++)
       {
           nums1[m] = nums2[i];
           m++;
       } 

       for (int i=0;i<nums1.length-1;i++)
       {
           int index = i;
           for (int j=i+1;j<nums1.length;j++)
           {
               if (nums1[index]>nums1[j])
               {
                index = j;
               }
           }
           int temp = nums1[index];
           nums1[index] = nums1[i];
           nums1[i] = temp;
           
       }

    }
}

public class Merge_Sorted_Array {
    
}
