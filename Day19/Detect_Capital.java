package Day19;

import java.util.Scanner;

// Leetcode Problem 520

// Detect Capital

// We define the usage of capitals in a word to be right when one of the following cases holds:

// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.

// Example 1:

// Input: word = "USA"
// Output: true

// Algorithm

/**
 * First Check if word length is 1 if Yes return true
 * Set a Boolean variable to true and integer index_break to -1
 * Iterate through word and if a chracter in word is not capital set Boolean to false and index break to i and Break
 * Now if Boolean is false and index_break is 0 or 1 then check if any remaing character after that is lower case or not
 * If any single reamining character is capital return false
 * return Boolean at end
 * END
 */

/* ============================================================================================================================= */


class Solution {
    public boolean detectCapitalUse(String word) {

        if (word.length()==1) return true;

        boolean capital = true;
        int index_break = -1;

        for (int i=0;i<word.length();i++)
        {
            if (word.charAt(i)<'A' || word.charAt(i)>'Z') 
            {
                capital = false;
                index_break = i;
                break;
            }
        }

        if (!capital && (index_break==0 || index_break==1))
        {
            capital = true;
            for (int i=index_break+1;i<word.length();i++)
            {
                if (word.charAt(i)<'a' || word.charAt(i)>'z') return false;
            }
        }
        return capital;
        
        
    }
}

public class Detect_Capital {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        scan.close();

        Solution sol = new Solution();

        System.out.println(sol.detectCapitalUse(word));

    }
}
