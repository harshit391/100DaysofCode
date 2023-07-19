package Day36;

// Leetcode Problem 4

// Median of Two Sorted Arrays

// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

// My Solution
// https://leetcode.com/problems/median-of-two-sorted-arrays/solutions/3786163/merge-sort-solution-beats-100/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        int len = n1+n2;

        int[] result = new int[len];

        int i=0,j=0,k=0;

        while (i<=n1 && j<=n2)
        {
            if (i==n1)
            {
                while (j<n2)
                {
                    result[k] = nums2[j];
                    k++;
                    j++;
                }
            break;
            }

            if (j==n2)
            {
                while (i<n1)
                {
                    result[k] = nums1[i];
                    k++;
                    i++;
                }
            break;
            }

            if (nums1[i]<nums2[j])
            {
                result[k] = nums1[i];
                k++;
                i++;
            }
            else 
            {
                result[k] = nums2[j];
                k++;
                j++;
            }
        }


        if (result.length%2!=0)
        return (float)result[len/2];

    
        return ((float)(result[(len/2)-1] + result[(len/2)])/2);

    }
}

public class Median_of_Two_Sorted_Arrays
{

}