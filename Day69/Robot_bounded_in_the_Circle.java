package Day69;

// Leetcode Problem 1041 

// Robot Bounded In Circle

// On an infinite plane, a robot initially stands at (0, 0) and faces north. Note that:

// The north direction is the positive direction of the y-axis.
// The south direction is the negative direction of the y-axis.
// The east direction is the positive direction of the x-axis.
// The west direction is the negative direction of the x-axis.
// The robot can receive one of three instructions:

// "G": go straight 1 unit.
// "L": turn 90 degrees to the left (i.e., anti-clockwise direction).
// "R": turn 90 degrees to the right (i.e., clockwise direction).
// The robot performs the instructions given in order, and repeats them forever.

// Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.

// Example 1:

// Input: instructions = "GGLLGG"
// Output: true
// Explanation: The robot is initially at (0, 0) facing the north direction.
// "G": move one step. Position: (0, 1). Direction: North.
// "G": move one step. Position: (0, 2). Direction: North.
// "L": turn 90 degrees anti-clockwise. Position: (0, 2). Direction: West.
// "L": turn 90 degrees anti-clockwise. Position: (0, 2). Direction: South.
// "G": move one step. Position: (0, 1). Direction: South.
// "G": move one step. Position: (0, 0). Direction: South.
// Repeating the instructions, the robot goes into the cycle: (0, 0) --> (0, 1) --> (0, 2) --> (0, 1) --> (0, 0).
// Based on that, we return true.

// My Solution
// https://leetcode.com/problems/robot-bounded-in-circle/solutions/3940290/beats-100-easy-solution/

class Solution {
    public boolean isRobotBounded(String instructions) {

        // Bascially Our x and y axis
        int[] ans = new int[2];

        // To circulate between changing directions
        char[] directions =  {'n','w','s','e'};

        // index we used to circulate among directions
        int idx = 0;
        // It represents north direction

        for (char k : instructions.toCharArray())
        {   
            // If character is L which means move towards right in Array
            if (k=='L') 
            {
                idx++;
                // If index exceeds 3 index reset it to north i.e. zero
                if (idx==4) idx=0;
            }

            // If character is R which means move towards left in array
            if (k=='R')
            {
                idx--;
                // If index get lower than 0 reset it to 3 i.e. East
                if (idx==-1) idx=3;
            }

            if (k=='G')
            {
                // According to conditions given in question update ans array of x and y axis   
                // if direction is north means positive y direction
                if (directions[idx]=='n') ans[1]++; 

                // if direction is south means negetive y direction
                if (directions[idx]=='s') ans[1]--;

                // if direction is east means positive x direction
                if (directions[idx]=='e') ans[0]++;

                // if direction is west means negetive x direction
                if (directions[idx]=='w') ans[0]--;
            }
        }

        // If it is facing some another direction then there will be a possiblity that it never leaves the circle

        // And if it return to origin it is win win i.e. true
        if ((ans[0]==0 && ans[1]==0) || idx!=0) return true;

        // Return false otherwise
        return false;


    }
}

public class Robot_bounded_in_the_Circle {
    
}
