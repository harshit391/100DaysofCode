package Day73;

//Leetcode Prblem 754
//
//Reach a Number
//
//You are standing at position 0 on an infinite number line. There is a destination at position target.
//
//You can make some number of moves numMoves so that:
//
//On each move, you can either go left or right.
//During the ith move (starting from i == 1 to i == numMoves), you take i steps in the chosen direction.
//Given the integer target, return the minimum number of moves required (i.e., the minimum numMoves) to reach the destination.
//
//Example 1:
//
//Input: target = 2
//Output: 3
//Explanation:
//On the 1st move, we step from 0 to 1 (1 step).
//On the 2nd move, we step from 1 to -1 (2 steps).
//On the 3rd move, we step from -1 to 2 (3 steps).

//My Solution
//https://leetcode.com/problems/reach-a-number/solutions/3958759/beats-81-easy-java-solution/

class Solution {
    public int reachNumber(int target) {

        // Number of Steps
        int step = 0;

        // Our main Countt variable
        int count = 0;

        // Firstly Convert target to its absolute value
        target = Math.abs(target);

        // while out count is less than target
        // Or count - target is odd number
        // Beacuse if count - target is even it always exceeds the value
        while(count < target || (count - target)% 2 != 0){
            step++; // Increment the steps
            count += step; // Increment count by number of steps
        }

        // return steps at end
        return step;
    }
}
public class Reach_a_Number {
}
