package Day77;

import java.util.*;

// Leetcode Problem 1209 

// Remove All Adjacent Duplicates in String II

// You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together.

// We repeatedly make k duplicate removals on s until we no longer can.

// Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique.

// Example 1:

// Input: s = "abcd", k = 2
// Output: "abcd"
// Explanation: There's nothing to delete.

// My Solution
// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/solutions/3977077/stack-of-pairs-solution-java/

class Solution {
    public String removeDuplicates(String s, int k) {

        // Create a Stack of Pairs of Character and Integer
        // Where we update pair if the character repeats itself to a frequency
        Stack<Pair<Character, Integer>> stack = new Stack<>();

        char[] chs = s.toCharArray();

        for (int i=0;i<s.length();i++)
        {
            // Set count to 1 initially 
            int count = 1;
            // Current character as character at i in string
            char curr = chs[i];

            // If character is already present in stack
            if (!stack.isEmpty() && stack.peek().getKey() == curr)
            {
                // Increase the count 
                count += stack.peek().getValue();
                // Pop that pair from stack
                stack.pop();
            }
            // Update pair with character and its new count
            stack.push(new Pair<>(curr, count));

            // If count becomes equal to k
            if (count == k)
            {
                // Pop that pair from stack as we don't need it
                stack.pop();
            }
        }

        // Our main result
        StringBuilder result = new StringBuilder();

        // Till Stack get empty
        while (!stack.isEmpty())
        {
            // Create a pair of character and integer as from stack and pop it
            Pair<Character, Integer> temp = stack.pop();
            
            // Take character and freqency as sepreated variables
            char c = temp.getKey();
            int freq = temp.getValue();

            // Untill our frequency is more than 0
            while (freq-- > 0)
            {
                // Append that character in main result
                result.append(c);
            }
        }
        
        // Return the result string reversed converting it to string
        return result.reverse().toString();
    }
}

public class Remove_all_adjacent_duplicates_in_String_II {
    
}
