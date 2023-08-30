package Day78;

// Leetcode Problem 2366 

// Minimum Replacements to Sort the Array

// You are given a 0-indexed integer array nums. In one operation you can replace any element of the array with any two elements that sum to it.

// For example, consider nums = [5,6,7]. In one operation, we can replace nums[1] with 2 and 4 and convert nums to [5,2,4,7].
// Return the minimum number of operations to make an array that is sorted in non-decreasing order.

// Example 1:

// Input: nums = [3,9,3]
// Output: 2
// Explanation: Here are the steps to sort the array in non-decreasing order:
// - From [3,9,3], replace the 9 with 3 and 6 so the array becomes [3,3,6,3]
// - From [3,3,6,3], replace the 6 with 3 and 3 so the array becomes [3,3,3,3,3]
// There are 2 steps to sort the array in non-decreasing order. Therefore, we return 2.

// My Solution
// https://leetcode.com/problems/minimum-replacements-to-sort-the-array/solutions/3980316/easy-one-pass-solution-java/

class Solution {
    public long minimumReplacement(int[] nums) {
        // Number of Replacements
        long answer = 0;

        // We have to start iterating from 2nd last element in array in backwards direction
        int len = nums.length-2;

        for (int i=len;i>-1;i--)
        {
            // If Already Sorted continue
            if (nums[i]<=nums[i+1]) continue;
            else 
            {
                // Calculate number of divisions can be made of that element with respect to its next element
                long result = ((long) (nums[i]+nums[i+1]-1))/((long)(nums[i+1]));

                // Add 1 less than result in answer because result gives us divisions till it become 1 but we have to do division 1 less than it
                answer += result-1;

                // Divide that element of array by result 
                nums[i]/=(int)(result);
            }
        }

        // Return the answer
        return answer;
    }
}

public class Minimum_Replacement_to_Sort_An_Array {
    
}
