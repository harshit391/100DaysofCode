package Day51;

// Leetcode Problem 941 

// Valid Mountain Array

// Given an array of integers arr, return true if and only if it is a valid mountain array.

// Recall that arr is a mountain array if and only if:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

// Example 1:

// Input: arr = [2,1]
// Output: false

class Solution {
    public boolean validMountainArray(int[] arr) {

        int i = 1;
        boolean strictlyIncreasing = false;
        boolean strictlyDecreasing = false;

        while( i < arr.length && arr[i] > arr[i-1] ){
            strictlyIncreasing = true;
            i++;
        }

        while( i < arr.length && arr[i] < arr[i-1] ){
            strictlyDecreasing = true;
            i++;
        }

        return strictlyIncreasing && strictlyDecreasing && i == arr.length;

    }
}

public class Valid_Mountain_Array {
    
}
