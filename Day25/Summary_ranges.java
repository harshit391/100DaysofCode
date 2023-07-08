package Day25;

import java.util.*;

// Leetcode Problem 228 

// Summary Ranges

// You are given a sorted unique integer array nums.

// A range [a,b] is the set of all integers from a to b (inclusive).

// Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

// Each range [a,b] in the list should be output as:

// "a->b" if a != b
// "a" if a == b
 

// Example 1:

// Input: nums = [0,1,2,4,5,7]
// Output: ["0->2","4->5","7"]
// Explanation: The ranges are:
// [0,2] --> "0->2"
// [4,5] --> "4->5"
// [7,7] --> "7"

// Algorithm

/**
 * Create a result ArrayList 
 * if length of nums is zero return empty result
 * set two index as index1 and index2 to 0 (Two Pointers Method)
 * Start Iterating from 0 by i indexing to one less than last index of nums 
 * if element at i is one less than element at i+1 set index2 to i+1
 * else add element at index1 to result then add -> sign then add index2 element to result
 * Increment index2 and set index1 to index2
 * Now if index1 get equal to index2 then add any one index element to result and increment both indices
 * After the loop ended check if reaming index1 and index2 are equal 
 * If they are, add last element to result and if not then add index1 element and then -> and then index2 element to result
 * END
 */

/* ========================================================================================================== */

class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>(); 
        if (nums.length==0) return result;

        int index1 = 0;
        int index2 = 0;

        for (int i=0;i<nums.length-1;i++)
        {
            if (nums[i]==nums[i+1]-1) 
            index2 = i+1;

            else if (index1==index2) 
            {
                result.add(""+nums[index1]);
                index1++;
                index2++;
            }

            else 
            {
                result.add(nums[index1]+"->"+nums[index2]);
                index1 = ++index2;
            } 
        }

        if (index1==index2) result.add(""+nums[nums.length-1]);
        else result.add(nums[index1]+"->"+nums[index2]);

        return result;
    }
}

public class Summary_ranges {
    
}
