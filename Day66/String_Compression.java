package Day66;

// Leetcode Problem 443 

// String Compression

// Given an array of characters chars, compress it using the following algorithm:

// Begin with an empty string s. For each group of consecutive repeating characters in chars:

// If the group's length is 1, append the character to s.
// Otherwise, append the character followed by the group's length.
// The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

// After you are done modifying the input array, return the new length of the array.

// You must write an algorithm that uses only constant extra space.

// Example 1:

// Input: chars = ["a","a","b","b","c","c","c"]
// Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
// Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

// My Solution
// https://leetcode.com/problems/string-compression/solutions/3925454/beats-97-java/

class Solution {
    public int compress(char[] chars) {
       int i= 0; 

       // For in place updatation of characters
       int res = 0;

       while (i < chars.length)
       {
           // Creating a window of length 1 
           int count = 1;

           // If characters inside the length of window are same increase the window length
           while (i + count < chars.length && chars[i+count]==chars[i])
           {
               count++;
           }
           // As the window length ended update character at res index to current character
           chars[res++] = chars[i];

           // If count of character is more than 1
           if (count>1)
           {
               // Convert window lenght to string value then to character array
               for (char k : Integer.toString(count).toCharArray())
               chars[res++] = k; // append value at res index in chars
           }    
           // Increment i by current window length
           i+=count;
       }

       // Return res which is actually till how much index our in place occurs 
       return res;
    }
}

public class String_Compression {
    
}
