package Day89;

import java.util.Stack;

// Leetcode Problem 84 

// Largest Rectangle in Histogram

// Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

// Example 1:

// Input: heights = [2,1,5,6,2,3]
// Output: 10
// Explanation: The above is a histogram where width of each bar is 1.
// The largest rectangle is shown in the red area, which has an area = 10 units.

// My Solution
// https://leetcode.com/problems/largest-rectangle-in-histogram/solutions/4027099/beats-81-stack-of-pair-solution/


class Solution {
    public int largestRectangleArea(int[] heights) {
        // Create a stack of Pair of Index and height
        Stack<Pair> st= new Stack<>();

        // Tracking area
        int area=0;

        // Iterating the array
        for(int i=0;i<heights.length; i++){
            // Setting index we have to pair as start to i
            int start= i;
            // If stack is not empty and stack top height is greater than current height
            while(!st.isEmpty() && st.peek().height>heights[i]){
                // We pop the pair of index and height at top of stack
                Pair set= st.pop();

                // Calculate area from them
                area= Math.max(area, (i-set.index)*set.height);

                // Update start to index we get from top of stack
                start=set.index;
            }
            // At last we push the start index updated with current height
            st.push(new Pair(start,heights[i]));
        }

        // If there something left in stack calculate area from that heights and indexes and update the max area if needed
        while(!st.isEmpty()){
            Pair set= st.pop();
            area= Math.max(area, (heights.length-set.index)*set.height);
        }
        return area;
    }
}

// Main Pair Class which actually is the backbone of this question
class Pair{
    int index;
    int height;
    public Pair(int index, int height){
        this.index= index;
        this.height= height;
    }
}

public class Largest_rectangle_in_histogram {
    
}
