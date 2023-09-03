package Day80;

// Leetcode Problem 400 

// Nth Digit

// Given an integer n, return the nth digit of the infinite integer sequence [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...].

// Example 1:

// Input: n = 3
// Output: 3

// My Solution
// https://leetcode.com/problems/nth-digit/solutions/3988608/beats-100-proper-explanation/

class Solution {
    public int findNthDigit(int n) {
        // Total number of digits in n
        int digits = 1;

        // Maximum number of current unit
        long count = 9;

        // Least number of current unit
        int start = 1;
        

        while (n > digits * count) {
            n -= digits * count;
            // Calculate number of digits
            digits++;
            // Increment the max and min number by multiplying it by 10
            count *= 10;
            start *= 10;
        }

        // At end increment the min number by nth digits found by n-1 / digits
        start += (n - 1) / digits;

        // Convert start to string
        String s = Integer.toString(start);

        // Return n - 1 digit from string converting it to Integer
        return Character.getNumericValue(s.charAt((n - 1) % digits));
    }
}

public class Nth_digit {
    
}
