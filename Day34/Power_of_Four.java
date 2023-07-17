package Day34;

// Leetcode Problem 342 

// Power of Four

// Given an integer n, return true if it is a power of four. Otherwise, return false.

// An integer n is a power of four, if there exists an integer x such that n == 4x.

// Example 1:

// Input: n = 16
// Output: true

// My Solution
// https://leetcode.com/problems/power-of-four/solutions/3778851/beats-100-using-recursion-java-solution/

class Solution {
    public boolean isPowerOfFour(int n) {
        if (n==1) return true;
        
        if (n%4!=0) return false;

        if (n<=0) return false;

        
        if (isPowerOfFour(n/4)) return true;

        return false;
    
    }
}

public class Power_of_Four {
    
}
