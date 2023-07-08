package Day25;

import java.util.Arrays;

// Leetcode Problem 506 

// Relative Ranks

// You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

// The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

// The 1st place athlete's rank is "Gold Medal".
// The 2nd place athlete's rank is "Silver Medal".
// The 3rd place athlete's rank is "Bronze Medal".
// For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").

// Return an array answer of size n where answer[i] is the rank of the ith athlete.

// Example 1:

// Input: score = [5,4,3,2,1]
// Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
// Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].

// Algorithm

/**
 * Create a score array clone as arr and sort the score 
 * Now Create a result array of length equal to score array length
 * Set a position variable to 4
 * Start double loop where Outer loop is traversing backwards with i indexing and inner loop forwards with j indexing
 * if element at ith index in score is equal to jth index element in arr 
 * If i is equal to last index of score set jth element of result array to Gold Medal
 * If i is equal to second last index of score set jth element of result array to Silver Medal 
 * If i is equal to third last index of score set jth element of result array to Bronze Medal
 * Else set jth element of result to positing integer converted to string and increment position by 1
 * END  
 */

 /* =============================================================================================== */

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = score.clone();

        String[] result = new String[score.length];

        Arrays.sort(score);

        int position = 4;

        for (int i=arr.length-1;i>=0;i--)
        {
            for (int j=0;j<arr.length;j++)
            {
                if (score[i]==arr[j])
                {
                    if (i==arr.length-1) result[j] = "Gold Medal";
                    else if (i==arr.length-2) result[j] = "Silver Medal";
                    else if (i==arr.length-3) result[j] = "Bronze Medal";
                    else {result[j] = ""+position;position++;}
                }
            }
        }

        return result;
    }
}

public class Relative_Ranks {
    
}
