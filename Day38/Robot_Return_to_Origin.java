package Day38;

// Leetcode PRoblem 657 

// Robot Return to Origin

// There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

// You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).

// Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.

// Note: The way that the robot is "facing" is irrelevant. 'R' will always make the robot move to the right once, 'L' will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.

// Example 1:

// Input: moves = "UD"
// Output: true
// Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.

// My Solution
// https://leetcode.com/problems/robot-return-to-origin/solutions/3795591/beats-96-easy-java-solution/

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0; // Set x coordinate to 0
        int y = 0; // Set y coordinate to 0

        for (char k : moves.toCharArray())
        {
            // if character is U increment y by 1
            if (k=='U') y += 1;

            // if character is D decrement y by 1
            if (k=='D') y -= 1;

            // if character is L increment x by 1
            if (k=='L') x += 1;

            // if character is R decrement x by 1
            if (k=='R') x -= 1;
        }

        // if x and y remains 0 after all operations return true
        if (x==0 && y==0) return true; 

        // Else false will be returned
        return false;
    }
}

public class Robot_Return_to_Origin {
    
}
