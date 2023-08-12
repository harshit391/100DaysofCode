package Day60;

import java.util.ArrayList;
import java.util.List;

// Leetcode Problem 658 

// Find K Closest Elements

// Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

// An integer a is closer to x than an integer b if:

// |a - x| < |b - x|, or
// |a - x| == |b - x| and a < b

// Example 1:

// Input: arr = [1,2,3,4,5], k = 4, x = 3
// Output: [1,2,3,4]

// My Solution
// https://leetcode.com/problems/find-k-closest-elements/solutions/3898828/beats-93-sliding-window-java/

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();

        // Siding Windows from 0th index to last index of input array
        int low = 0;
        int high = arr.length-1;

        // Find the Window containing the closest element to k
        while (high-low>=k)
        {
            // Decreasing our Sliding window for our solution part
            if (Math.abs(arr[low]-x)>Math.abs(arr[high]-x))
            low++;

            else 
            high--;
        }

        // Add that window's elements in Arraylist
        for (int i=low;i<=high;i++)
        ans.add(arr[i]);

        return ans;
    }
}

public class Find_k_closest_elements {
    
}
