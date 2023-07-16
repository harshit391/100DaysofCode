package Day33;

// Leetcode Problem 1281 

// Subtract the Product and Sum of Digits of an Integer

// Given an integer number n, return the difference between the product of its digits and the sum of its digits.

// Example 1:

// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15

// My Solution
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/solutions/3774400/easiest-solution-very-simple-java-solution/

class Solution {
    public int product (String n)
    {
        int product = 1;
        int sum = 0;
        for (int i=0;i<n.length();i++)
        {
            int s = (n.charAt(i)-'0');
            product*=s;
            sum+=s;
        }

        return product-sum;
    }

    public int subtractProductAndSum(int n) {

        return product(String.valueOf(n));
    }
}

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    
}
