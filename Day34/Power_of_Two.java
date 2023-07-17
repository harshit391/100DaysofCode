package Day34;

// Leetcode Problem 231 

// Power of Two

// Given an integer n, return true if it is a power of two. Otherwise, return false.

// An integer n is a power of two, if there exists an integer x such that n == 2x.

// Example 1:

// Input: n = 1
// Output: true
// Explanation: 20 = 1

// My Solution
// https://leetcode.com/problems/power-of-four/solutions/3778851/beats-100-using-recursion-java-solution/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==1) return true;

        if (n%2!=0) return false;

        if (n<=0) return false;

       if (isPowerOfTwo(n/2)) return true;
        return false;
    } 
}

public class Power_of_Two {
    
}
