package Day34;

// Leetcode Problem 326 

// Power of Three

// Given an integer n, return true if it is a power of three. Otherwise, return false.

// An integer n is a power of three, if there exists an integer x such that n == 3x.

// Example 1:

// Input: n = 27
// Output: true
// Explanation: 27 = 33

// My Solution
// https://leetcode.com/problems/power-of-three/solutions/3778847/beats-99-using-recursion-java-solution/

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n==1) return true;
        
        if (n%3!=0) return false;

        if (n<=0) return false;

        
        if (isPowerOfThree(n/3)) return true;


        return false;
    }

}

public class Power_of_Three {
    
}
