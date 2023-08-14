package Day61;

// Leetcode Problem 1095 

// Find in Mountain Array

// (This problem is an interactive problem.)

// You may recall that an array arr is a mountain array if and only if:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
// Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

// You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

// MountainArray.get(k) returns the element of the array at index k (0-indexed).
// MountainArray.length() returns the length of the array.
// Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.

// Example 1:

// Input: array = [1,2,3,4,5,3,1], target = 3
// Output: 2
// Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
 class Solution {
    public int bnsr(MountainArray mountainArr, int start, int end, int target)
    {
        // Check if the array is sorted in increasing or decreasing order
        boolean des = false;
        if (mountainArr.get(start)>mountainArr.get(end))
        {
            des = true;
        }

        if (des)
        {
            // If in Decreasing order reverse the logics of binary search 
            while (start<=end)
            {
                int mid = start + (end-start)/2;

                if (mountainArr.get(mid)==target)
                return mid;

                else if (mountainArr.get(mid)>target)
                start = mid + 1;

                else end = mid - 1;
            }
        }
        else
        {
            while (start<=end)
            {
                int mid = start + (end-start)/2;

                if (mountainArr.get(mid)==target)
                return mid;

                else if (mountainArr.get(mid)>target)
                end = mid - 1;

                else start = mid + 1;
            }
        }

        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int left= 1; // Traverse array from left
        int right = mountainArr.length()-1; // Traverse array from right
        int found = -1;

        while(left<=right)
        {
            // Calcualte mid of left and right index
            int mid = left + (right-left)/2;

            // if mid element is greater than its after element and its before element
            if((mountainArr.get(mid) > mountainArr.get(mid+1)) && (mountainArr.get(mid)>mountainArr.get(mid-1)))
            {
                found = mid;
                break; // return that mid index storing it in found
            }

            // if its afterwards elements is greater than set left to mid + 1
            if(mountainArr.get(mid)<mountainArr.get(mid+1))
            left = mid+1;

            // Else just update right index with mid - 1
            else    
            right = mid-1;
        }

        // Try searching the target in first half from 0 to found index
        int ans = bnsr(mountainArr, 0, found, target);

        // If found return that index
        if (ans!=-1) return ans;

        // Else return whatever we get after searching it in second half
        return bnsr(mountainArr, found+1, mountainArr.length()-1, target);
        
    }
}

public class Find_in_Moutain_Array {
    
}
