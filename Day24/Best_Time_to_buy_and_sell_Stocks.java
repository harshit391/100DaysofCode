package Day24;

// Leetcode Problem 121

// Best Time to buy and sell stocks

// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

// Algorithm

/**
 * set left index to 0 and right index to 1 and max to 0
 * start while loop which check right index is less than length of price array
 * if price at left index is greater than price at right index 
 * set left index to right index
 * else set max to maximum of max and difference between prices at right index and left index
 * Append right index by 1 every time
 * return max to end
 */

/* ================================================================================================= */

class Solution {
    public int maxProfit(int[] prices) {

        int left_index = 0,right_index = 1,max = 0;

        while (right_index<prices.length)
        {
            if (prices[left_index] > prices[right_index])
            {
                left_index = right_index;
            }
            else if (prices[left_index] < prices[right_index])
            {
                max = Math.max(max,prices[right_index] - prices[left_index]); 
            }

            right_index++;
        }

        return max;
    }
}

public class Best_Time_to_buy_and_sell_Stocks {
    
}
