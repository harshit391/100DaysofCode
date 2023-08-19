package Day67;

// Leetcode Problem 896 

// Monotonic Array

// An array is monotonic if it is either monotone increasing or monotone decreasing.

// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

// Example 1:

// Input: nums = [1,2,2,3]
// Output: true

// My Solution
class Solution {

    public boolean isMonotonic(int[] nums) {

        if (nums.length==1) return true;
        
        boolean des = false;
        int i=0;
        int j=1;
        while (j<nums.length)
        {
            if (nums[i]>nums[j])
            {
                des = true;
                break;
            }

            i++;
            j++;
        }

        int low = 0;
        int high = nums.length-1;

        if(des)
        {
            while (low<=high)
            {
                if (nums[low]>=nums[low+1] && nums[high]<=nums[high-1])
                {
                    low++;
                    high--;
                }

                else return false;
            }
        }
        else
        {
            while (low<=high)
            {
                if (nums[low]<=nums[low+1] && nums[high]>=nums[high-1])
                {
                    low++;
                    high--;
                }

                else return false;
            }
        }

        return true;
    }
}

public class Monotonic_array {
    
}
