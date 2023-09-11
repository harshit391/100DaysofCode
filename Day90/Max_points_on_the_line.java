package Day90;

import java.util.HashMap;

// Leetcode Problem 149 

// Max Points on a Line

// Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.

// Example 1:

// Input: points = [[1,1],[2,2],[3,3]]
// Output: 3

// My Solution
// https://leetcode.com/problems/max-points-on-a-line/solutions/4031475/easy-hashmap-solution-java/

class Solution {
    public int maxPoints(int[][] points) {

        // Edge Case
        if (points.length==1) return 1;

        // Main result
        // There will be atleast one point which contains slope
        int res = 1;

        // Iterate through array 
        for (int i=0;i<points.length;i++)
        {   
            // Get seperate array from points 2d array at ith index
            int[] p1 = points[i];
            
            // Create a hashmap for storing Slope and its count
            HashMap<Double, Integer> map  = new HashMap<>();

            for (int j=i+1;j<points.length;j++)
            {
                // Set slope initially to maximum value 
                // Because if x[i] and x[j] are equal that means denominator in slope becomes zero and that results to infinity
                Double slope = Double.MAX_VALUE;

                // Create a seperate array from points 2d array at jth index
                int[] p2 = points[j];

                // if in both arrays the 0th index element which is actually x[i] and x[j] do not equal then only
                if (p1[0]!=p2[0])
                {
                    // Calculate slope
                    slope = (double)(p2[1] - p1[1]) / (double)(p2[0]-p1[0]);

                    // Double sometime give this anomilly so convert this to 0.0 otherwise let slope to its original
                    slope = slope == -0.0 ? 0.0 : slope;
                }
                // Increase Count value of slope in Hashmap
                map.put(slope, map.getOrDefault(slope, 0)+1);

                // And update the result the maximum value of count of that slope
                res = Math.max(res, map.get(slope));
            }
        }
        
        // Return result increased by 1 as we are not counting the very first point which started it all
        return res+1;

    }
}

public class Max_points_on_the_line {
    
}
