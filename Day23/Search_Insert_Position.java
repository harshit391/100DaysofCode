package Day23;

// Leetcode Problem 35

// Search Insert Position

// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2

// Algorithm

/**
 * Initialize low to 0 and high to last value of nums
 * Create a while loop which check whether low is less than equal to high
 * create mid which is mid index of low and high index everytime loop get restarted
 * if target present at mid index of num return mid
 * else if target is smaller than mid index element of nums set high to mid -1
 * else if target is larger than mid index element of nums set low to mid + 1
 * At last if element not found return 1 added to high index remained
 * END
 */

/* ====================================================================================================== */

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;

        while(low<=high)
        {
            int mid = (low+high)/2;
            if (target==nums[mid]) return mid;

            if (target<nums[mid]) high = mid-1;

            if (target>nums[mid]) low = mid+1;
        }

        return high+1;
    }
}

public class Search_Insert_Position {
    
}
