package Day22;

// Leetcode Problem 824

// Goat Latin

// You are given a string sentence that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.

// We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:

// If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
// For example, the word "apple" becomes "applema".
// If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
// For example, the word "goat" becomes "oatgma".
// Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
// For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.
// Return the final sentence representing the conversion from sentence to Goat Latin.

// Example 1:

// Input: sentence = "I speak Goat Latin"
// Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

// Algorithm

/**
 * Create a function which check the character is vowel or not
 * if vowel return false else true
 * Create a string array named words of sentence by spliting by regex method
 * Create a stringbuilder goat 
 * iterate through string array 
 * Everytime create a new string builder of ith element of word array
 * if character is not vowel append the first character at last and delete the first character
 * else do nothing
 * Just append ma at the end at any case
 * not create a integer temp of i+1 and while temp become zero append a to ith element
 * And append the result word to goat 
 * Convert Goat to String 
 * END
 */

/* ================================================================================================== */

class Solution {
    public boolean isvowel(char s)
    {
        char[] vowels = {'a','A','e','E','i','I','o','O','u','U'};

        for (int i=0;i<10;i++)
        {
            if (vowels[i]==s) return false;
        }

        return true;
    }

    public String toGoatLatin(String sentence) {
        
        String[] words = sentence.split("[ ]+");

        StringBuilder goat = new StringBuilder();

        for (int i=0;i<words.length;i++)
        {
            StringBuilder sb = new StringBuilder(words[i]);

            if (isvowel(sb.charAt(0))) 
            {
                sb.append(sb.charAt(0));
                sb.delete(0,1);
            }
            sb.append("ma");

            int as = i+1; 

            while (as-->0) sb.append("a");

            goat.append(sb.toString());
            goat.append(" ");
        }

        return goat.toString().trim();


    }
}

public class Goat_Latin {
    public static void main(String []args)
    {

    }
}
