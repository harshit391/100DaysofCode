package Day50;

// Leetcode Problem 32 

// Longest Valid Parentheses

// Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses 
// substring.

// Example 1:

// Input: s = "(()"
// Output: 2
// Explanation: The longest valid parentheses substring is "()".

// My Solution
// https://leetcode.com/problems/longest-valid-parentheses/solutions/3852410/beats-100-easy-to-understand-java/

class Solution {
    public int longestValidParentheses(String s) {
        
        int open=0,close=0;
        int ans=0;
        
        // Checking Case in which close brackets are more than open brackers
        
        // This will keep account for number of open brackets comming before close braket
        // So that (()) this case gives correct answer
        
        // Like Open get incremented 2 times as close > open remains false
        
        // Then Close get incremented 2 times then open == close gets true as open =2 and close =2 hence answer will be updated as open+close = 4

        for(int i=0;i<s.length();++i){
            
            char ch=s.charAt(i);
            
            if(ch=='(')
                ++open;
            
            else
                ++close;
            
            if(open==close)
                ans=Math.max(ans,open+close);
            
            // current substring is invalid. So reset if close is more than open
            else if(close>open){
                open=close=0;
            }
        }
        
        // Resetting to check the case for open > close
        open=close=0;

        // Checking Case in which open brackets are more than closed brackers
        
        // This will keep account for number of open brackets comming after close braket as we are moving backwards
        
        // Like close get incremented 2 times as open > close remains false
        
        // Then open get incremented 2 times then open == close gets true as open = 2 and close =2 hence answer will be updated as open+close = 4
        
        for(int i=s.length()-1;i>=0;--i){
            
            char ch=s.charAt(i);
            
            if(ch=='(')
                ++open;
            
            else
                ++close;
            
            if(open==close)
                ans=Math.max(ans,open+close);
            
            // current substring is invalid. So reset is open is more than close
            else if(open>close)
                open=close=0;
        }
        
        return ans;
        
    }
}

public class Longest_Valid_Parenthesis {
    
}
