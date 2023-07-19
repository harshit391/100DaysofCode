package Day36;

// Leetcode Problem 35 

// Search Insert Position

// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2

// My Solution
// https://leetcode.com/problems/search-insert-position/solutions/3786069/simplest-binary-seach-solution-beats-100/

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;
        int found = -1;

        while(low<=high)
        {
            int mid = (low+high)/2;
            if (target==nums[mid]) 
            {    
                found = mid;
                break;
            }

            if (target<nums[mid]) high = mid-1;

            if (target>nums[mid]) low = mid+1;
        }

        if (found==-1) return high+1;


        return found;
    }
}

public class Search_Insert_Postion {
    
}
