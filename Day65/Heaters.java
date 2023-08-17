package Day65;

import java.util.Arrays;

// Leetcode Problem 475 

// Heaters

// Winter is coming! During the contest, your first job is to design a standard heater with a fixed warm radius to warm all the houses.

// Every house can be warmed, as long as the house is within the heater's warm radius range. 

// Given the positions of houses and heaters on a horizontal line, return the minimum radius standard of heaters so that those heaters could cover all houses.

// Notice that all the heaters follow your radius standard, and the warm radius will the same.

// Example 1:

// Input: houses = [1,2,3], heaters = [2]
// Output: 1
// Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, then all the houses can be warmed.

// My Solution
// https://leetcode.com/problems/heaters/solutions/3922924/beats-88-java/

class Solution {
    public int findRadius(int[] houses, int[] heaters) {

        // Sort both the arrays
        Arrays.sort(houses);
        Arrays.sort(heaters);

        // Main answer
        int radius = 0;

        // heaters index
        int j = 0;

        // Iterate array
        for(int i = 0; i < houses.length; i++) {
            // Calculate distance between houses[i] and heaters[j]
            int dis = Math.abs(houses[i] - heaters[j]);
            while (true) {
                
                // Check if j is scritly less than one less than heaters length
                // To avoid array bounds of exception
                if(j < heaters.length-1) {

                    // Now again calculate distance between houses[i] and heaters[j+1]
                    int dis2 = Math.abs(houses[i] - heaters[j+1]);

                    // If current distance is less than or equal to previous distance 
                    if(dis2 <= dis) {
                        // Update previous distance with current distance
                        // Increment heaters index
                        j++;
                        dis = dis2;
                    } else {
                        // break the loop if current distance is greater
                        break;
                    }
                } else {
                    // Break the loop if j exceeds our condition
                    break;
                }
            }
            // Update radious with maximum value of dis achieved
            radius = radius >= dis ? radius : dis;
        }
        return radius;
    }
}

public class Heaters {
    
}
