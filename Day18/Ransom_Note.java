package Day18;

// Leetcode Problem 383

// Ransom Note

// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.


// Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false

// Algorithm

/**
 * make two frequency array for ransomeNote and magazine
 * Count the frequexies of each character in both strings
 * Traverse from 0 to ransome Note string length
 * if any character's frequency in ransomNote is greater then that same character's frequency in magazine
 * Return false
 * Also if ransomenote length is greater than magazine length return false
 * Else Return true
 */

import java.util.Scanner;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {


        if (ransomNote.length()>magazine.length()) return false;

        int[] frequency1 = new int[26];
        int[] frequency2 = new int[26];

        for (int i=0;i<ransomNote.length();i++) 
        frequency1[(int)(ransomNote.charAt(i) - 'a')]++; 

        for (int i=0;i<magazine.length();i++)
        frequency2[(int)(magazine.charAt(i) - 'a')]++;

        for (int i=0;i<ransomNote.length();i++)
        {
            if (frequency1[(int)(ransomNote.charAt(i) - 'a')] > frequency2[(int)(ransomNote.charAt(i) - 'a')]) return false;
        }

        return true;

    }

}

public class Ransom_Note {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        String k = scan.next();

        scan.close();

        Solution sol = new Solution();

        System.out.println(sol.canConstruct(s, k));


    }
}
