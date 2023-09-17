// Leetcode Problem 49 

// Group Anagrams

// Given an array of strings strs, group the anagrams together. You can return the answer in any order.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

// My Solution
// https://leetcode.com/problems/group-anagrams/solutions/4055428/easy-hashmap-solution-beats-98/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a Map from Original String and its anagrams
        HashMap<String,List<String>> map=new HashMap<>();

        // Create a 2d Arraylist of String
        List<List<String>> result = new ArrayList<>();

        for (String word: strs) {

            // Convert words from strs to charArray
            char[] charArray = word.toCharArray();

            // Sort that character array
            Arrays.sort(charArray);

            // Convert sorted char array to String
            String sortedWord = String.valueOf(charArray);

            // If map not contains that sorted word add it to map 
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            // Else add the word mapping with sorted word 
            map.get(sortedWord).add(word);
        }

        // Add all the ArrayList mapped with their respective sorted versions in the result 2d arraylist of strings
        result.addAll(map.values());

        return result;
    }
}

public class Group_Anagrams {
    
}
