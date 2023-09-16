// Leetcode Problem 165 

// Compare Version Numbers

// Given two version numbers, version1 and version2, compare them.

// Version numbers consist of one or more revisions joined by a dot '.'. Each revision consists of digits and may contain leading zeros. Every revision contains at least one character. Revisions are 0-indexed from left to right, with the leftmost revision being revision 0, the next revision being revision 1, and so on. For example 2.5.33 and 0.1 are valid version numbers.

// To compare version numbers, compare their revisions in left-to-right order. Revisions are compared using their integer value ignoring any leading zeros. This means that revisions 1 and 001 are considered equal. If a version number does not specify a revision at an index, then treat the revision as 0. For example, version 1.0 is less than version 1.1 because their revision 0s are the same, but their revision 1s are 0 and 1 respectively, and 0 < 1.

// Return the following:

// If version1 < version2, return -1.
// If version1 > version2, return 1.
// Otherwise, return 0.
 
// Example 1:

// Input: version1 = "1.01", version2 = "1.001"
// Output: 0
// Explanation: Ignoring leading zeroes, both "01" and "001" represent the same integer "1".

/**
 * Basically We have to keep track of the numbers till the period and compare them
 * So Untill the decimal point comes add the version1 and versio2 digits in seperate variables 
 * Compare them
 * If version 1 is greater return 1 otherwise -1
 * Edge Case :- if both are null or equal return 0
 */
class Solution {
    public int compareVersion(String version1, String version2) {

        // Edge Case if both are entered null return 0
        if (version1 == null || version2 == null) return 0;
    
        int i = 0, j = 0;

        while(i < version1.length() || j < version2.length()) 
        {
            int v1 = 0, v2 = 0;

            // Untill the period add the digits from version 1 into a variable v1
            while (i < version1.length() && version1.charAt(i) != '.') 
            {
                v1 = v1*10+(version1.charAt(i)-'0');
                i++;
            }
            
            // Untill the period add the digits from version 2 into a variable v2
            while (j < version2.length() && version2.charAt(j) != '.') 
            {
                v2 = v2*10+(version2.charAt(j)-'0');
                j++;
            }
            
            // Compare them and return the value as per the condition
            if (v1 > v2) return 1;
            else if (v1 < v2) return -1;
            
            // Skip the decimal character
            i++;
            j++;
        }

        // If nothing happens above that means both are equal so return 0
        return 0;
    }
}

public class Compare_Version_Numbers {
    
}
