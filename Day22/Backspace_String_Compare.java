package Day22;

// Leetcode Problem 844

// Backspace String Compare

// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.

// Example 1:

// Input: s = "ab#c", t = "ad#c"
// Output: true
// Explanation: Both s and t become "ac".

// Algorithm

/**
 * Create two string builders of a and t 
 * initialze i to 0 
 * start a while loop with condition i less than s length
 * if character in s is # delete character at i-1 and # too
 * if i is 0 then delete # and set i to 0 again and make while loop to continue again from start
 * else increment i by 1
 * Same do with t string
 * At last compare both strings and if equal return true else false
 * END
 */

/* ================================================================================================== */

class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder(s);

        StringBuilder s2 = new StringBuilder(t);

        int i=0;
        while (i<s1.length())
        {
        if (s1.charAt(i)=='#') 
        {
            if (i!=0)  
            s1.delete(i-1,i+1);

            if (i==0) s1.delete(0,1);

            i=0;

            continue;
        }
        i++;
        }

        i=0;


        while (i<s2.length())
        {
        if (s2.charAt(i)=='#') 
        {

            if (i!=0) 
            s2.delete(i-1,i+1);
            
            if (i==0) s2.delete(0,1);

            i=0;
            continue;
            

        }
        i++;
        }


        if (s1.toString().equals(s2.toString())) return true;
        return false;
    }
}

public class Backspace_String_Compare {
    
}
