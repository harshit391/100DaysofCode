package Day29;

// Leetcode Problem 69 

// Sqrt(x)

// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 
// Example 1:

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.

// For More Details
// https://leetcode.com/problems/sqrtx/solutions/3754802/easiest-solution-with-log-n-complexity/

class Solution {
    public int mySqrt(int x) {
        
        for (long i=1;i<=x/2+1;i++)
        {
            if (i*i>x) return (int)(i-1);
            else if (i*i==x) return (int)(i);
        }

        return 0;

    }
}

public class Sqrt {
    
}
