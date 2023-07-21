package Day38;

// Leetcode Problem 2554 

// Maximum Number of Integers to Choose From a Range I

// You are given an integer array banned and two integers n and maxSum. You are choosing some number of integers following the below rules:

// The chosen integers have to be in the range [1, n].
// Each integer can be chosen at most once.
// The chosen integers should not be in the array banned.
// The sum of the chosen integers should not exceed maxSum.
// Return the maximum number of integers you can choose following the mentioned rules.

// Example 1:

// Input: banned = [1,6,5], n = 5, maxSum = 6
// Output: 2
// Explanation: You can choose the integers 2 and 4.
// 2 and 4 are from the range [1, 5], both did not appear in banned, and their sum is 6, which did not exceed maxSum.

// My Solution
// https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/solutions/3797497/beats-100-easy-java-solution/

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int integers  = 0; // Track the count of integers whose sum is result
        int sum = 0; // Track the sum of integers

        // A boolean array to keep track of banned numbers
        boolean[] bannedNumbers = new boolean[10001];

        for(int i = 0; i < banned.length; i++)
            bannedNumbers[banned[i]] = true; // Using integers in banned array as index in banned Numbers boolean array


         for(int i=1; i<=n; i++){
             // It checks that the number is present in bannednumbers array or not
            if(!bannedNumbers[i]){
                // if not present add that integer to sum
                sum+=i;
                // At point when sum get greater than maxSum break the loop
                if(sum > maxSum) break;
                integers++; // Keep incrementing the intgers by 1
                
            }
        }

        // return integers as count of values we need
        return integers;
    }
}

public class Maximum_Number_of_Integers_to_Chose_From_Range_I {
    
}
