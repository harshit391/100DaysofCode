package Day85;

// Leetcode Problem 1250 

// Check If It Is a Good Array

// Given an array nums of positive integers. Your task is to select some subset of nums, multiply each element by an integer and add all these numbers. The array is said to be good if you can obtain a sum of 1 from the array by any possible subset and multiplicand.

// Return True if the array is good otherwise return False.
 
// Example 1:

// Input: nums = [12,5,7,23]
// Output: true
// Explanation: Pick numbers 5 and 7.
// 5*3 + 7*(-2) = 1

// My Solution
// https://leetcode.com/problems/check-if-it-is-a-good-array/solutions/4009049/very-easy-gcd-solution-java/

class Solution {

    public int gcd(int a, int b)
    {
        if (b==0) return a;

        if (a>b)
        return gcd(b , a%b);

        else 
        return gcd(a, b%a);
    }


    public boolean isGoodArray(int[] nums) {
        
        int result = nums[0];

        for (int i=1;i<nums.length;i++)
        {
            if (result==1) return true;

            else result = gcd(result, nums[i]);
        }

        if (result==1) return true;
        return false;
    }
}

public class Check_if_it_is_a_Good_Array {
    
}
