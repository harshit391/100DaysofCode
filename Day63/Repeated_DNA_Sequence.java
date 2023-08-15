package Day63;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Leetcode Problem 187

// Repeated DNA Sequences

// The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

// For example, "ACGAATTCCG" is a DNA sequence.
// When studying DNA, it is useful to identify repeated sequences within the DNA.

// Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.

// Example 1:

// Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
// Output: ["AAAAACCCCC","CCCCCAAAAA"]

// My Solution
// https://leetcode.com/problems/repeated-dna-sequences/solutions/3912506/beats-81-easy-solution-using-hashset/

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seenSubStrings = new HashSet<>();
        HashSet<String> repeatedSequences = new HashSet<>();

        for (int j = 0; j <= s.length() - 10; j++) {
            String subs = s.substring(j, j + 10);
            if (seenSubStrings.contains(subs)) {
                repeatedSequences.add(subs);
            }
            seenSubStrings.add(subs);
        }

        return new ArrayList<>(repeatedSequences);
    }
}
    

public class Repeated_DNA_Sequence {
    
}
