// Leetcode Problem 8

// Convert String to Integer

// Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

// The algorithm for myAtoi(string s) is as follows:

// Read in and ignore any leading whitespace.
// Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
// Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
// Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
// If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
// Return the integer as the final result.

// Example 3:

// Input: s = "4193 with words"
// Output: 4193

// Algorithm

/**
 * Creating a function to check whether the string is valid according to condition in Problem
 * Trimmming Leading white spaces for easiness
 * Making a function to check the actual valid digits we need from string
 * Creating an array to valid digits
 * According to condition append the numbers in string in Array
 */

/* ======================================================================================================== */

import java.util.*;

class Solution {
    public boolean valid_or_not(String s)
    {
        boolean valid = true;

        // Case of an empty string
        if (s.length()==0) valid = false;

        // Case of single character other then number or not
        else if (s.length()==1)
        {
            if (s.charAt(0)>='0' && s.charAt(0)<='9') valid = true;
            else valid = false;
        }
        
        // Check if the first character is number or not
        else if (s.charAt(0)>'0' && s.charAt(0)<='9') valid = true;

        // Checking if the first character is negetive sign or positive sign then the other should be a number 
        else if (s.charAt(0)=='-' || s.charAt(0)=='+')
        {
            if (s.charAt(1)>='0' && s.charAt(1)<='9') valid = true;
            else valid = false;
        }

        // Deleting leading zeroes if any
        else {
            for (int i=0;i<s.length()-1;i++)
            {
                if (s.charAt(i)=='0')
                {
                    if (s.charAt(i+1)>'0' && s.charAt(i+1)<='9') valid = true;
                    else valid = false;
                }
            }
        }

        return valid;

    }

    public int countnumber(String s)
    {

        // Function to count valid digits in string
        int numbers = 0;

        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='-' || s.charAt(i)=='+') 
            {
                if (i==0) continue; // if - or + sign is at 0 index then itws valid otherwise not
                else break; // if any other character between numbers it will break
            }
            else if (s.charAt(i)=='.') break; // if there is a decimal point break
            else if (s.charAt(i)>='0' && s.charAt(i)<='9') numbers++; // only count valid digits
            else break; // any other case break
        }

        return numbers;
    }


    public int myAtoi(String s) {
        s = s.trim(); // Triming the String to cut down leading whitespaces

        if (!valid_or_not(s)) return 0; // If not valid just return 0 as per the problem

        else{
            long number_from_string = 0;

            int total_numbers_in_string = countnumber(s);

            int[] arr = new int[total_numbers_in_string]; // Creating array to length valid digits in string

            int index = 0; 

            for (int i=0;i<s.length();i++)
            {
                // if - or + at index 0 its okay otherwise break
                if (s.charAt(i)=='-' || s.charAt(i)=='+') 
                {
                    if (i==0) continue;
                    else break;
                }
                // Append the valid digits in array 
                else if (s.charAt(i)>='0' && s.charAt(i)<='9') {arr[index]=s.charAt(i)-'0';index++;}
                else break;
            }
                

        double first_number = Math.pow(10,total_numbers_in_string-1);

        // convert array into an integer
        for (int i=0;i<total_numbers_in_string;i++)
        {
            number_from_string += first_number*arr[i];
            first_number/=10;
        }

        // Check if the given number in string is negetive as per '-' sign at the lead
        if (s.charAt(0)=='-') number_from_string*=-1;

        // For the worst case check if the integer is in the range of an Integer
        if (number_from_string < Integer.MIN_VALUE)
        {
            number_from_string = Integer.MIN_VALUE;
        }
        else if (number_from_string > Integer.MAX_VALUE)
        {
            number_from_string = Integer.MAX_VALUE;
        }

        return (int)number_from_string;
    }

    }
}

public class StringtoInteger{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        scan.close();

        Solution sol = new Solution();

        int integer_value = sol.myAtoi(s);

        System.out.println(integer_value);


    }
}
