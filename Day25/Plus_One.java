package Day25;

// Leetcode Problem 66 

// Plus One

// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

// Algorithm

/**
 * Traverse array backwards with i indexing
 * if element is less than 9 increment it by one and return the array
 * if not set that index to 0 in array
 * At Last Increase the size of array by them (Although a total new array is created)
 * Set first index of array to 1 and return array
 * END
 */

/* ======================================================================================== */

class Solution {
    public int[] plusOne(int[] digits) {

    for (int i=digits.length-1;i>=0;i--)
    {
        if (digits[i] < 9) 
        {
            digits[i]++;
            return digits;
        }
        digits[i] = 0; 
    }

  
    digits = new int[digits.length+1];
    digits[0] = 1;
    return digits;
    }

}

public class Plus_One {
    
}
