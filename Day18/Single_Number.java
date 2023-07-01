package Day18;

import java.util.Scanner;

// Leetcode Problem 136

// Single Number

// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Example 1:

// Input: nums = [2,2,1]
// Output: 1

// Algorithm

/**
 * Traverse outer loop from 0 to nums length
 * Everytime enter the loop set frequency to 0
 * Traverse inner loop from 0 to nums length
 * After the inner loop end check if frequency is 1 
 * If not continue else return number at that index
 * END
 */

class Solution {
    public int singleNumber(int[] nums) {
        
        
        for (int i=0;i<nums.length;i++)
        {
            int frequency = 0;
            for (int j=0;j<nums.length;j++)
            {
                if (nums[j]==nums[i]) frequency++;
            }
            if (frequency==1) return nums[i];
        } 

        return 0;

    }
}

public class Single_Number {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();

        int[] numbers = new int[m];

        for (int i=0;i<m;i++)
        {
            numbers[i] = scan.nextInt();
        }

        scan.close();

        Solution sol = new Solution();

        System.out.println(sol.singleNumber(numbers));

    }
}
