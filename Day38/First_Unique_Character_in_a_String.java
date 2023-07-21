package Day38;

// Leetcode Problem 387 

// First Unique Character in a String

// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// Example 1:

// Input: s = "leetcode"
// Output: 0

// My Solution
// https://leetcode.com/problems/first-unique-character-in-a-string/solutions/3795249/beats-89-java-solution/

class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];

        for (char a : s.toCharArray())
        {
            arr[a-'a']++;
        }

        int i=0;
        for (char a : s.toCharArray())
        {
            if (arr[a-'a']==1) 
            {
                return i;
            }
            i++;
        }

        return -1;
    }
}

public class First_Unique_Character_in_a_String {
    
}
