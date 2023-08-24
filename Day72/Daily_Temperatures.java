package Day72;

//Leetcode Problem 739
//
//Daily Temperatures
//
//Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
//
//Example 1:
//
//Input: temperatures = [73,74,75,71,69,72,76,73]
//Output: [1,1,4,2,1,1,0,0]

import java.util.Stack;

//My Solution
//https://leetcode.com/problems/daily-temperatures/solutions/3953911/beats-71-easy-stack-solution/
class Solution {
    public int[] dailyTemperatures(int[] nums) {

        int n = nums.length;

        // Our resultant array
        int[] ans = new int[n];

        // temporary Stack but this does the whole thing
        Stack<Integer> temp = new Stack<>();

        for (int i=0;i<n;i++)
        {
            // Now if stack is not empty and while ith value is bigger than its afterwards elements as Stack Stores it in reverse order from backwards of array
            while (!temp.isEmpty() && nums[i] > nums[temp.peek()])
            {
                // store that index where bigger than ith index element contains and pop it out of the stack
                int idx = temp.pop();
                // Keep appending the values at that index as i - index
                ans[idx] = i - idx;
            }
            // Push current index in stack
            temp.push(i);
        }

        // Return our resultant array of integers
        return ans;
    }
}

public class Daily_Temperatures {


}
