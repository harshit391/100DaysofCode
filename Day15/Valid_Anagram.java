package Day15;

// Leetcode Problem 242

// Valid Anagram

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false

// Algorithm

/**
 * Is both strings have different lengths then false
 * Else Create two Integer Arrays of 26 length with every value 0
 * Travese the strings and Convert character of string to ASCII Value and subtract it by 97
 * Take the result value as index for a array specified to the string 
 * Increment the value at that index which calcualte frequency of that character
 * After Taking this for both the strings check both strings have equal frequecy of the character
 * If not Then False else True
 * END
 */

/*====================================================================================================== */


import java.util.Scanner;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        boolean ana = true;

        if (s.length()!=t.length()) ana = false;

        else {

        int string1[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int string2[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        for (int i=0;i<s.length();i++) string1[(int)(s.charAt(i))-97]++;
        for (int i=0;i<t.length();i++) string2[(int)(t.charAt(i))-97]++;

        for (int i=0;i<26;i++)
        {
            if (string1[i]!=string2[i]) {ana = false;break;}
        }
        }

        return ana;
    }
}

public class Valid_Anagram{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        String k = scan.next();

        scan.close();

        Solution sol = new Solution();

        boolean value = sol.isAnagram(s,k);

        System.out.println(value);


    }
}