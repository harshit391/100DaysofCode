package Day22;

import java.util.*;

// A sentence is a string of single-space separated words where each word consists only of lowercase letters.

// A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

// Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

// Example 1:

// Input: s1 = "this apple is sweet", s2 = "this apple is sour"
// Output: ["sweet","sour"]

// Algorithm

/**
 * Make two string array of both strings by spliting regex method
 * Create two string list one to concatenate both string arrays and other is resultantlist
 * iterate the concatenated list and set a boolean found to false everytime
 * if a word get repeated set found to true and break there
 * if found remain false then add that word to resultant list
 * At end Convert resultant list to string array 
 * END
 */

/* =================================================================================================== */

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words1 = s1.split("[ ]+");
        String[] words2 = s2.split("[ ]+");

        

        List<String> result = new ArrayList<>();
        List<String> uncommon = new ArrayList<>();

        for (int i=0;i<words1.length;i++) 
        result.add(words1[i]);

        for (int i=0;i<words2.length;i++) 
        result.add(words2[i]);

        for (int i=0;i<result.size();i++)
        {
            boolean found = false;   
            for (int j=0;j<result.size();j++)
            {
                if (result.get(i).equals(result.get(j)) && i!=j)
                {
                    found = true;
                    break;
                } 
            }
            if (!found) uncommon.add(result.get(i)); 
            continue;

        }

        String[] result_array = uncommon.toArray(new String[0]);

        return result_array;


    }
}

public class Uncommon_Words_from_two_Sentences {
    
}
