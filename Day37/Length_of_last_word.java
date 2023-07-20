package Day37;

// Leetcode Problem 58 

// Length of Last Word

// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.

// My Solution
// https://leetcode.com/problems/length-of-last-word/solutions/3790510/beats-100-easy-solution-java/

class Solution {
    public int lengthOfLastWord(String s) {

        s = s.trim();
        int index = -1;

        for (int i=s.length()-1;i>=0;i--)
        {
            if (s.charAt(i)==' ') {index=i;break;}
        }

        String p = s.substring(index+1,s.length());

        return p.length();

    }
}

public class Length_of_last_word {
    
}
