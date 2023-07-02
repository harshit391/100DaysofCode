package Day19;

import java.util.*;

// Leetcode Problem 500

// Keyboard Row

// Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

// In the American keyboard:

// the first row consists of the characters "qwertyuiop",
// the second row consists of the characters "asdfghjkl", and
// the third row consists of the characters "zxcvbnm"

// Example 1:

// Input: words = ["Hello","Alaska","Dad","Peace"]
// Output: ["Alaska","Dad"]

// Algorithm

/**
 * Create three String each represting a keyboard row
 * Create a String ArrayList
 * Iterate from 0 to length of input String array
 * Set threee booleans to true
 * create inner iterating from 0 to ith word in input array length
 * Create substring of a particular character of that word
 * Use Contains Method to check if that substring consists in a single row
 * If any one of the booleans remains true add words to String ArrayLIst
 * Convert ArrayList of String to Normal Array
 * END
 */

/* ==================================================================================================== */

class Solution {
    public String[] findWords(String[] words) {
        
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (int i=0;i<words.length;i++)
        {
            boolean r1 = true;
            boolean r2 = true;
            boolean r3 = true;
            for (int j=0;j<words[i].length();j++)
            {
                String sub = words[i].substring(j,j+1).toLowerCase();
                if (!row1.contains(sub)) r1 = false;
                if (!row2.contains(sub)) r2 = false;
                if (!row3.contains(sub)) r3 = false;
            }

            if (r1 || r2 || r3) result.add(words[i]);

            
        }

        String[] result_words = new String[result.size()];

        result.toArray(result_words);

        return result_words;


    }
}

public class Keyborad_Row {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();

        String[] words = new String[m];

        int i=0;

        while(i<m)
        {
            words[i] = scan.next();
            i++;
        }

        scan.close();

        Solution sol = new Solution();

        System.out.println(sol.findWords(words));
    }
}
