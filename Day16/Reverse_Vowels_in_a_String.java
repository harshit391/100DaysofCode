package Day16;

// Leetcode Problem 345

// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 
// Example 1:

// Input: s = "hello"
// Output: "holle"

// Algorithm

/**
 * Create a sepeate function to check a character is vowel or not
 * create a start index and end index to keep updating the reversing indexes
 * Form a String Builder to create a mutable string to perform operations easily
 * Traverse from start of string if find a vowel start traversing from end of the string 
 * Once get the vowel from the end reverse it 
 * Decrement the end index and increment the start index and break the inner loop
 * Covert the result StringBuilder to String
 * END
 */

/* ================================================================================================================================ */

import java.util.Scanner;

class Solution {

    public boolean checkvowel(char k)
    {
        boolean valid = false;

        char[] vowels = {'a','A','E','e','I','i','O','o','U','u'};

        for (char e:vowels)
        {
            if (e==k) {valid = true;break;}
        }

        return valid;
    }

    public String reverseVowels(String s) {

        StringBuilder sb = new StringBuilder(s);

        int index_start = 0;
        int index_end= s.length()-1;
        char temp = ' ';

        System.out.println(s.length()/2);

        for (int i=index_start;i<s.length();i++)
        {
            if (checkvowel(sb.charAt(i)))
            {
                for (int j = index_end;j>=i;j--)
                {
                    if (checkvowel(sb.charAt(j)))
                    {
                        temp = sb.charAt(i);
                        sb.setCharAt(i ,sb.charAt(j));
                        sb.setCharAt(j , temp);
                        index_end = j-1;
                        index_start = i+1;
                        break;
                    }
                }
                continue;
            }
        }

        return sb.toString();
    }
}


public class Reverse_Vowels_in_a_String {

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        scan.close();

        Solution sol = new Solution();

        String value = sol.reverseVowels(s);

        System.out.println(value);

    }
    
}


