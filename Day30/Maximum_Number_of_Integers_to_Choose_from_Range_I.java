package Day30;

import java.util.HashSet;
import java.util.Set;

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
// https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/solutions/3760107/very-easy-solution-using-hashset/

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int integers  = 0;
        int sum = 0;

        Set<Integer> value = new HashSet<>();

        for (int a:banned)
        {
            value.add(a);
        }

        for (int i=1;i<=n;i++)
        {
            if (!value.contains(i))
            {
                sum+=i;
                if (sum<=maxSum)
                integers++;
            }
        }

        return integers;
    }
}

public class Maximum_Number_of_Integers_to_Choose_from_Range_I {
    
}
