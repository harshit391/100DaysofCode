package Day84;

import java.util.Arrays;
import java.util.Stack;

// Leetcode Problem 853 

// Car Fleet

// There are n cars going to the same destination along a one-lane road. The destination is target miles away.

// You are given two integer array position and speed, both of length n, where position[i] is the position of the ith car and speed[i] is the speed of the ith car (in miles per hour).

// A car can never pass another car ahead of it, but it can catch up to it and drive bumper to bumper at the same speed. The faster car will slow down to match the slower car's speed. The distance between these two cars is ignored (i.e., they are assumed to have the same position).

// A car fleet is some non-empty set of cars driving at the same position and same speed. Note that a single car is also a car fleet.

// If a car catches up to a car fleet right at the destination point, it will still be considered as one car fleet.

// Return the number of car fleets that will arrive at the destination.

// Example 1:

// Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
// Output: 3
// Explanation:
// The cars starting at 10 (speed 2) and 8 (speed 4) become a fleet, meeting each other at 12.
// The car starting at 0 does not catch up to any other car, so it is a fleet by itself.
// The cars starting at 5 (speed 1) and 3 (speed 3) become a fleet, meeting each other at 6. The fleet moves at speed 1 until it reaches target.
// Note that no other cars meet these fleets before the destination, so the answer is 3.

// My Solution
// https://leetcode.com/problems/car-fleet/solutions/4005791/easy-java-stack-solution/

// According to question if the a car reaches target before other there will be a chance that they had made a fleet

// We had given postion and speed 
// By which we can calculate the time between them

// So Map the position and speed and Sort that array with respect to position in ascending order

// As we know Time = distance/speed

// Distance will be target - postion 
// Speed is already given

// In reverse Iteration Say right to left in array being made
// If time is less than the left value then they are not gonna making any fleet
// Othewise there will be chance of making them a fleet

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        // Create a Stack of double data type
        Stack<Double> stack = new Stack<Double>();
        
        // And a 2d array to map position and speed
        int[][] dis = new int[position.length][2];

        // Add position and speed in 2d array
        for (int i=0;i<position.length;i++)
        {
            dis[i][0] = position[i];
            dis[i][1] = speed[i];
        }

        // Sort that 2d array with respect to position
        Arrays.sort(dis, (x,y) -> Integer.compare(x[0], y[0]));
        
        int n = dis.length;
        
        // Reverse iteratation
        for (int i=n-1;i>=0;i--)
        {
            // Calculate time to reach the target by physics time = distance/speed
            // Distance = target - position
            // Speed is given at speed
            double a = (double)(target - dis[i][0])/dis[i][1];

            // If current time is less than or equal to top value in stack
            if (!stack.isEmpty() && a <= stack.peek())
            {
                // Skip that as they never gonna meet and make a fleet
                continue;
            }
            else
            {
                // Otherwise push the time in stack
                stack.push(a);
            }
        }

        // At the end return the size of stack
        return stack.size();

    }
}

public class Car_Fleet {
    
}
