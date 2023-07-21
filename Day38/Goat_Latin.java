package Day38;

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

// My Solution
// https://leetcode.com/problems/goat-latin/solutions/3797086/beats-100-simple-java-solution/

class Solution {
    public boolean isVowel(char k)
    {
        // character array of vowels
        char[] v = {'a','e','i','o','u','A','E','I','O','U'};

        for (char a : v) 
        {
            // if character input is in vowel array return true
            if (a==k) return true;
        }

        return false;
    }

    public String toGoatLatin(String sentence) {

        // split the sentence using regex into words array
        String[] words = sentence.split(" ");

        // Create a string builder
        StringBuilder sb = new StringBuilder();
        
        // Iterate through words array
        for(int i = 0; i < words.length; i++){

            // if first character of element in word is vowel append element and ma at the end or it
            if(isVowel(words[i].charAt(0)))
            {
                sb.append(words[i]).append("ma");
            } 
            else 
            {
                // else create two substring of element in word as one from index 1 to end and append it to string builder then another substring from index 0 to 1 and append it to string builder then append ma
                sb.append(words[i].substring(1)).append(words[i].substring(0, 1)).append("ma");
            }

            // As per problem append a to the word till count of its position in words array
            for(int j = 0; j <= i; j++)
                sb.append('a');

            // Append the space in string builder
            sb.append(" ");
        }
        
        // Converted string builder to string and then trim it
        return sb.toString().trim();
    }
}

public class Goat_Latin {
    
}
