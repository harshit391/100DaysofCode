package Day40;

// Leetcode Problem 122 

// Best Time to Buy and Sell Stock II

// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

// Find and return the maximum profit you can achieve.

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 7
// Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
// Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
// Total profit is 4 + 3 = 7.

// My Solution
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/solutions/3805970/beats-100-simplest-solution-java/

class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length; 
        int profit=0; // Calculating the profit
        
        for(int i=0; i<=n-2; i++){
            // Simply We have to calculate differences between the numbers , So Store the difference from the afterwards element in the index
            prices[i] = prices[i+1]- prices[i]; 
        }
        
        for(int i=0; i<=n-2; i++){
            // Simply If at any index prices are positive then just add it to profit 
            if(prices[i]> 0){
                profit+= prices[i];
            }
        }
        return profit;
    }
}

public class Best_time_to_sell_and_buy_Stock_II {
    
}
