package Day15;

// Leetcode Problem 151

// Reverse Words in a String

// Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"

// Algorithm

/**
 * Trim the original Array 
 * Create A String Builder to create a mutable String
 * If Input String has only 1 character return it as it is
 * Else check the length of a single word in string by checking the end space after word
 * Change the Start Index as +1 the word end space index
 * When the last word of string comes make it a sepearate case
 * Just simply add the last word by append 
 * Also Trim the words to avoid whitespaces
 * END
 */

/*========================================================================================================== */


import java.util.*;

class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        int index_start = 0;

        StringBuilder result = new StringBuilder("");

        if (s.length()==1) return s;

        else {

        for (int i=1;i<s.length();i++)
        {
            if (s.charAt(i-1)!=' ' && s.charAt(i)==' ')
            {
                String p  = s.substring(index_start,i).trim();
                result.insert(0,p);
                result.insert(0," ");
                index_start = i+1;
            }
            else if (i==s.length()-1)
            {
                String p  = s.substring(index_start,i+1).trim();
                result.insert(0,p);
            }
        }

        return result.toString();
        }

    }
}

public class Reverse_Words_in_String {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        scan.close();

        Solution sol = new Solution();

        String value = sol.reverseWords(s);

        System.out.println(value);
    }
}
