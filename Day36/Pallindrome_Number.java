package Day36;

// Leetcode Problem 9 

// Palindrome Number

// Given an integer x, return true if x is a palindrome and false otherwise.

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.

// My Solution (Best Exoplanation of any question I had submitted)
// https://leetcode.com/problems/palindrome-number/solutions/3785943/beat-99-62-java-easy-solution/


class Solution {
    public boolean isPalindrome(int x) {

        boolean p = false;

        int rem=0,rev=0,temp=x;
 
        while (x>0)
        {
            rem = x%10;
            rev = rev*10 + rem;
            x/=10;
        }

        if (rev==temp) p=true;

        return p;
    }
}


public class Pallindrome_Number {
    
}
