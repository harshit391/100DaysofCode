import java.util.Arrays;

// Leetcode Problem 2785 

// Sort Vowels in a String

// Given a 0-indexed string s, permute s to get a new string t such that:

// All consonants remain in their original places. More formally, if there is an index i with 0 <= i < s.length such that s[i] is a consonant, then t[i] = s[i].
// The vowels must be sorted in the nondecreasing order of their ASCII values. More formally, for pairs of indices i, j with 0 <= i < j < s.length such that s[i] and s[j] are vowels, then t[i] must not have a higher ASCII value than t[j].
// Return the resulting string.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase. Consonants comprise all letters that are not vowels.

// Example 1:

// Input: s = "lEetcOde"
// Output: "lEOtcede"
// Explanation: 'E', 'O', and 'e' are the vowels in s; 'l', 't', 'c', and 'd' are all consonants. The vowels are sorted according to their ASCII values, and the consonants remain in the same places.

// My Solution
// https://leetcode.com/problems/sort-vowels-in-a-string/solutions/4001892/beats-95-easy-java-solution/

class Solution {
    private boolean isVowel(char s)
    {
        if (s=='a' || s=='A') return true;
        if (s=='e' || s=='E') return true;
        if (s=='i' || s=='I') return true;
        if (s=='o' || s=='O') return true;
        if (s=='u' || s=='U') return true;

        return false;
    }

    public String sortVowels(String s) {

        // Convert s to Char Array
        char[] ch = s.toCharArray();

        int num_vowels = 0;
        
        // Calculate number of vowels in String
        for (char k : ch)
        {
            if (isVowel(k))
            num_vowels++;
        }

        // Initialize character array for vowels
        char[] vow = new char[num_vowels];
        int idx = 0;

        // Add vowels from string in Character array
        for (char k : ch)
        {
            if (isVowel(k))
            vow[idx++] = k;
        } 

        // Sort the character Array
        Arrays.sort(vow);

        // Convert String to String Builder
        StringBuilder sb = new StringBuilder(s);

        idx = 0;
        // Replace vowels from Sorted Character Array in String 
        for (int i=0;i<ch.length;i++)
        {   
            if (isVowel(ch[i]))
            {
                sb.setCharAt(i, vow[idx++]);
            }
        }

        // Convert String Builder to String And return it
        return sb.toString();
    }
}



public class Sort_Vowels_in_a_String {
    
}
