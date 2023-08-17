package Day65;

// Leetcode Problem 848 

// Shifting Letters

// You are given a string s of lowercase English letters and an integer array shifts of the same length.

// Call the shift() of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').

// For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
// Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.

// Return the final string after all such shifts to s are applied.

// Example 1:

// Input: s = "abc", shifts = [3,5,9]
// Output: "rpl"
// Explanation: We start with "abc".
// After shifting the first 1 letters of s by 3, we have "dbc".
// After shifting the first 2 letters of s by 5, we have "igc".
// After shifting the first 3 letters of s by 9, we have "rpl", the answer.

// My Solution
// https://leetcode.com/problems/shifting-letters/solutions/3922944/beats-99-java/

class Solution {
    public String shiftingLetters(String s, int[] shifts) {
    
        int i = s.length() -1;
        
        // Converting String to characther array
        char[] ch = s.toCharArray();

        int totalshifts = 0;

        while(i>=0){
            totalshifts += shifts[i]%26;

            // Shifiting letters in character array in such a way so that it doesn't exceeds a-z range

            // First converting character at i to integer and adding total shifts

            // Then Neutralize its range in a-z by moduling it by 26

            // Now add 'a' to again convert it into a-z range as we are shifiting letters taking a as 0 
            ch[i] = (char)((ch[i] - 'a' + totalshifts)%26 + 'a');

            // decrement i
            i--;
        }

        // Convert character array to string and return it
        return String.valueOf(ch);
    }
}

public class Shifting_Letters {
    
}
