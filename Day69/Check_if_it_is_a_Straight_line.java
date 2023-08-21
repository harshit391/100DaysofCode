package Day69;

// Leetcode Problem 1232 

// Check If It Is a Straight Line

// You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

// Example 1:

// Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
// Output: true

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        int y = coordinates[0][1] - coordinates[1][1];
        int x = coordinates[0][0] - coordinates[1][0];
        
        for (int i=1;i<coordinates.length;i++)
        {
            int x1 = coordinates[i][1] - coordinates[i-1][1];
            int y1 = coordinates[i][0] - coordinates[i-1][0];
            if (x1*x!=y1*y) {
                return false;
            }
        }

        return true;

    }
}

public class Check_if_it_is_a_Straight_line {
    
}
