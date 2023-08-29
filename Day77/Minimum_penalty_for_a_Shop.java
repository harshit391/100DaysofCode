package Day77;

// Leetcode Problem 2483 

// Minimum Penalty for a Shop

// You are given the customer visit log of a shop represented by a 0-indexed string customers consisting only of characters 'N' and 'Y':

// if the ith character is 'Y', it means that customers come at the ith hour
// whereas 'N' indicates that no customers come at the ith hour.
// If the shop closes at the jth hour (0 <= j <= n), the penalty is calculated as follows:

// For every hour when the shop is open and no customers come, the penalty increases by 1.
// For every hour when the shop is closed and customers come, the penalty increases by 1.
// Return the earliest hour at which the shop must be closed to incur a minimum penalty.

// Note that if a shop closes at the jth hour, it means the shop is closed at the hour j.

// Example 1:

// Input: customers = "YYNY"
// Output: 2
// Explanation: 
// - Closing the shop at the 0th hour incurs in 1+1+0+1 = 3 penalty.
// - Closing the shop at the 1st hour incurs in 0+1+0+1 = 2 penalty.
// - Closing the shop at the 2nd hour incurs in 0+0+0+1 = 1 penalty.
// - Closing the shop at the 3rd hour incurs in 0+0+1+1 = 2 penalty.
// - Closing the shop at the 4th hour incurs in 0+0+1+0 = 1 penalty.
// Closing the shop at 2nd or 4th hour gives a minimum penalty. Since 2 is earlier, the optimal closing time is 2.

// My solution
// https://leetcode.com/problems/minimum-penalty-for-a-shop/solutions/3974385/beats-100-easy-java-solution/

class Solution {
    public int bestClosingTime(String customers) {
        char[] k = customers.toCharArray();

        // To Count minimum min = 0 ( Sometime penalty is 0 )
        // Current gives us the current penalty count
        // Eh is the early hour track
        int min = 0,current = 0,eh = 0;

        for (int i=0;i<k.length;i++)
        {
            // If character is y decrease our penalty 
            if (k[i]=='Y') current--;

            // IF character is n increase our penalty
            if (k[i]=='N') current++;

            // If current count is less than min 
            if (current < min)
            {
                // Set early hour to current hour i.e. i + 1
                eh = i+1;
                // Set minimum to current
                min = current;
            }

        }

        // Return early hour 
        return eh;
    }
}

public class Minimum_penalty_for_a_Shop {
    
}
