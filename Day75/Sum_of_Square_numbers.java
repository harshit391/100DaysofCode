package Day75;

// Leetcode Problem 633 

// Sum of Square Numbers

// Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

// Example 1:

// Input: c = 5
// Output: true
// Explanation: 1 * 1 + 2 * 2 = 5

// My Solution
// https://leetcode.com/problems/sum-of-square-numbers/solutions/3966825/beats-95-easy-binary-search-solution/

class Solution {
    public boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long)Math.sqrt(c);

        while (start <= end)
        {
            long sum = start*start + end*end;

            if (sum == c) return true;

            else if (sum > c) end--;

            else start++;
        }

        return false;
    }
}

public class Sum_of_Square_numbers {
    
}
