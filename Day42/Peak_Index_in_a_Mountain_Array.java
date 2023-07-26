package Day42;

// Leetcode 852 

// Peak Index in a Mountain Array

// An array arr a mountain if the following properties hold:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
// Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

// You must solve it in O(log(arr.length)) time complexity.

// Example 1:

// Input: arr = [0,1,0]
// Output: 1

// My Solution
// https://leetcode.com/problems/peak-index-in-a-mountain-array/solutions/3813626/beats-100-modified-binary-search-approach/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left= 1; // Traverse array from left
        int right = arr.length-1; // Traverse array from right

        while(left<=right)
        {
            // Calcualte mid of left and right index
            int mid = left + (right-left)/2;

            // if mid element is greater than its after element and its before element
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            return mid; // return that mid index 

            // if its afterwards elements is greater than set left to mid + 1
            if(arr[mid]<arr[mid+1])
            left = mid+1;

            // Else just update right index with mid - 1
            else    
            right = mid-1;
        }

        // just return -1 at the end for null cases
        return -1;
    }
}

public class Peak_Index_in_a_Mountain_Array {
    
}
