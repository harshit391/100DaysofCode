package Day25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Leetcode 448 

// Find All Numbers Disappeared in an Array

// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

// Algorithm

/**
 * Create an ArrayList named result and HashSet names values
 * Add elemets of nums to values to filter duplicates
 * Now check from 1 to nums length if values does contain a number from 1 to nums length then add it to result
 * END
 */

/* ================================================================================================== */

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> values = new HashSet<>();

        for (int i=0;i<nums.length;i++)
        {
            values.add(nums[i]);
        }

        for (int i=1;i<=nums.length;i++)
        {
            if (!values.contains(i)) result.add(i);
        }

        return result;
    }
}

public class Find_All_Memebers_Disappeared_in_an_Array {
    
}
