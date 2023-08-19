package Day67;

// Leetcode Problem 1822 

// Sign of the Product of an Array

// There is a function signFunc(x) that returns:

// 1 if x is positive.
// -1 if x is negative.
// 0 if x is equal to 0.
// You are given an integer array nums. Let product be the product of all values in the array nums.

// Return signFunc(product).

// Example 1:

// Input: nums = [-1,-2,-3,-4,3,2,1]
// Output: 1
// Explanation: The product of all values in the array is 144, and signFunc(144) = 1

// My Solution
class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;

        for (int s : nums)
        {
            if (s<0) neg++;

            if (s==0) return 0;
        }

        if (neg%2==0) return 1;

        return -1;
    }
}

public class Sign_of_the_Product_of_array {
    
}
