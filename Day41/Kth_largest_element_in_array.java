package Day41;

// Leetcode Problem 215 

// Kth Largest Element in an Array

// Given an integer array nums and an integer k, return the kth largest element in the array.

// Note that it is the kth largest element in the sorted order, not the kth distinct element.

// Can you solve it without sorting?

// Example 1:

// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5

// My Solution
// https://leetcode.com/problems/kth-largest-element-in-an-array/solutions/3809486/beats-99-easy-java-solution/

class Solution {
    public int findKthLargest(int[] nums, int k) {

        // Create a frequency array val to track which number and count of that number present in nums 
        // It is of length 20001 as given in the constrains 
        // -10000 < nums[i] < 10000
        // So In worst case length should be 20001
        int[] val = new int[20001];

        // Set max to minimum value of the constraints from the problem
        int max = -10001;

        // Traverse through array and track the maximum element in array 
        for (int i=0;i<nums.length;i++)
        {
            max = (max < nums[i]) ? nums[i] : max;

            // Increase the element by 10000 and use it as index for val as you know we count frequency in array 
            val[nums[i]+10000]++;
        }

        // If k==1 then just return max value we get from first iteration
        if (k==1) return max;

        // Increment max by 10000 as to use it as index for val
        max+= 10000;
    
        // Iterate from max index to start of val array
        for (int i=max;i>=0;i--)
        {
            // if any element in val has count more than zero decrease k by its count present in nums
            if (val[i]!=0) k-=val[i];

            // if for any element k drop down to less than or equal to zero return that element by decrease current index by 10000
            if (k<=0)
            {
                return i-10000;
            }
        }

        // In some null case it will automatically return 0
        return 0;
    }
}

public class Kth_largest_element_in_array {
    
}
