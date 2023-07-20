package Day37;

// Leetcode Problem 125 

// Valid Palindrome

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

// My Solution
// https://leetcode.com/problems/valid-palindrome/solutions/3790698/two-pointers-approach-beats-97-java/

class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int low = 0;
        int high = s.length()-1;

        while (low <= high)
        {
            char left = s.charAt(low);
            char right = s.charAt(high);

            if ((left>='a' && left<='z') || (left>='0' && left<='9'))
            {
                if ((right >= 'a' && right <='z') || (right>='0' && right<='9'))
                {
                    if (left!=right) return false;
                    else
                    {
                        low++;
                        high--;
                    }
                }
                else high--;
            }
            else low++;
        }

        return true;


    }
}

public class Valid_Pallindrome {
    
}
