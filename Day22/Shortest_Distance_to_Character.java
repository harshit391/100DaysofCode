package Day22;

// Leetcode Problem 821

// Shortest Distance to Character

// Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

// The distance between two indices i and j is abs(i - j), where abs is the absolute value function.

// Example 1:

// Input: s = "loveleetcode", c = "e"
// Output: [3,2,1,0,1,0,0,1,2,2,1,0]
// Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
// The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
// The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
// For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
// The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.

// Algorithm

/**
 * create a result integer array
 * iterate through string and set minimum length to 10000 everytime loop entered
 * Create inner loop of string iteration and check if character is equal to c
 * if equal check if absolute distance between i and j is less then minimum
 * Is less then set minimum length to absolute distance
 * At end of inner loop add that length to result array 
 * END
 */

/* ========================================================================================================== */

class Solution {
    public int[] shortestToChar(String s, char c) {
        
        int[] result = new int[s.length()];

        for (int i=0;i<s.length();i++)
        {
            int minimum_length=100000;
            for (int j=0;j<s.length();j++)
            {
                if (s.charAt(j)==c) {
                if (minimum_length>Math.abs(i-j)) 
                minimum_length = Math.abs(i-j);
                }
            }
            result[i] = minimum_length;
        }

        return result;
    }
}

public class Shortest_Distance_to_Character{
    public static void main(String []args)
    {

    }
}