package Day82;

import java.util.ArrayList;
import java.util.Arrays;

// Leetcode Problem 56 

// Merge Intervals

// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

// Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

// My Solution
// https://leetcode.com/problems/merge-intervals/solutions/3995809/easy-java-solution-array-list/

class Solution {
    public int[][] merge(int[][] intervals) {
        
        // Make a ArrayList of integer arrays
        ArrayList<int[]> result = new ArrayList<int[]>();

        // Sort the intervals 2d arrays bases on 0th index in every nested array
        Arrays.sort(intervals, (x,y) -> Integer.compare(x[0],y[0]));

        // Initially add first interval array from 2d intervals array
        result.add(intervals[0]);

        // Start from 1st index
        for (int i=1;i<intervals.length;i++)
        {
            int n = result.size();

            // Let [x,y] be array present at last position of result arraylist
            // Let [a,b] be array present at ith postion in Intervals 2d Array
            
            // If y is greater than equal to a 
            // Track max between y and b and replace y by max

            if (result.get(n-1)[1] >= intervals[i][0])
            {
                result.get(n-1)[1] = Math.max(result.get(n-1)[1], intervals[i][1]);
            }
            
            // Else just add the [a,b] array as it is in Array List
            else
            {
                result.add(intervals[i]);
            }
        }

        // Convert result to 2d array and return it
        return result.toArray(new int[result.size()][2]);



        
    }
}

public class Merge_Intervals {
    
}
