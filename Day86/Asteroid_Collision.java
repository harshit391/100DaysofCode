package Day86;

import java.util.Stack;

// Leetcode Problem 735 

// Asteroid Collision

// We are given an array asteroids of integers representing asteroids in a row.

// For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

// Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

// Example 1:

// Input: asteroids = [5,10,-5]
// Output: [5,10]
// Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

// My Solution
// https://leetcode.com/problems/asteroid-collision/solutions/4014517/beats-88-easy-stack-solution/

class Solution {
/**
1. Now if the current is positive and top of stack is negetive they never gonna collide So just simpply push the current in stack

2. If the current is negetive and top of stack is positive then there will be collision

3. In this case Take sum of both of them taking current + top of stack

If the sum if negetive that means current wins so remove the top element from stack

But if the sum is positive that means our stack wins so just set current value in array to be 0 so that we never gonna mess with it

But in the case both are equal just remove the top of stack and set current to 0 in array

At last if the current doesn't change to 0 that means it belongs to the first case So simply push it in stack 

At last reverse copy the elemets of stack in a array and return it*/


    public int[] asteroidCollision(int[] asteroids) {
        // Create a Stack
        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<asteroids.length;i++)
        {
            while (asteroids[i]<0 && !stack.isEmpty() && stack.peek()>0)
            {
                int win = asteroids[i] + stack.peek();
                if (win < 0) stack.pop();

                else if (win > 0) asteroids[i] = 0;

                else {
                    asteroids[i] = 0;
                    stack.pop();
                }
            }

            if (asteroids[i]!=0)
            stack.push(asteroids[i]);
        }

        int[] result = new int[stack.size()];
        int idx = stack.size()-1;;

        while (!stack.isEmpty())
        {
            result[idx--] = stack.pop();
        }

        return result;


    }
}

public class Asteroid_Collision {
    
}
