package Day38;

import java.util.HashSet;
import java.util.Set;

// Leetcode Problem 804 

// Unique Morse Code Words

// International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

// 'a' maps to ".-",
// 'b' maps to "-...",
// 'c' maps to "-.-.", and so on.
// For convenience, the full table for the 26 letters of the English alphabet is given below:

// [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
// Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

// For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
// Return the number of different transformations among all words we have.


// Example 1:

// Input: words = ["gin","zen","gig","msg"]
// Output: 2
// Explanation: The transformation of each word is:
// "gin" -> "--...-."
// "zen" -> "--...-."
// "gig" -> "--...--."
// "msg" -> "--...--."
// There are 2 different transformations: "--...-." and "--...--.".

// My Solution
// https://leetcode.com/problems/unique-morse-code-words/solutions/3795715/beats-100-easy-java-solution/

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        // if String array length is 0 return 0
        if (words.length==0) return 0;

        // if String array length is 0 return 0
        if (words.length==1) return 1;

        // Create a String array cotaining morse code of all alphabets such 0 index represent morse code for a and so on
        String[] morse_alphabets = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        // Create a HashSet of String to Store String converted to its morse code version
        Set<String> sub = new HashSet<>();


        for (int i=0;i<words.length;i++)
        { 
            // Create a String builder everytime 
            StringBuilder sb = new StringBuilder();

            // Iterate Strings in input String array one by one 
            for (char k : words[i].toCharArray())
            {
                // Convert character into index such as 'a' character get converted to index 0 and so on and append its morse code to string builder by accessing its value from morse code String array
                sb.append(morse_alphabets[k - 'a']);
            }
            // Convert String Builder to String and add it to HashSet
            sub.add(sb.toString());
        }

        // Return size of resultant HashSet
        return sub.size();


    }
}

public class Unique_Morse_code_words {
    
}
