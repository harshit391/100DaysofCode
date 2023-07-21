package Day38;

// Leetcode Problem 414 

// Third Maximum Number

// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

// Example 1:

// Input: nums = [3,2,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2.
// The third distinct maximum is 1.

// My Solution
// https://leetcode.com/problems/third-maximum-number/solutions/3795293/beats-100-easy-java-solution/

class Solution {
    public int thirdMax(int[] nums) {
        

        long max_third = Long.MIN_VALUE;

        long max_first = Long.MIN_VALUE;

        long max_second = Long.MIN_VALUE;

        for (int a : nums)
        {
            if (a > max_first)
            {
                max_third = max_second;
                max_second = max_first;
                max_first = a;
            }
            else if (a > max_second && a < max_first)
            {
                max_third = max_second;
                max_second = a;
            }
            else if (a > max_third && a < max_second)
            {
                max_third = a;
            }
        }



        return (int)((max_third!=Long.MIN_VALUE) ? max_third : max_first);


    }
}

public class Third_Maximum {
    
}
