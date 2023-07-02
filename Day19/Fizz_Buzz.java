package Day19;

import java.util.*;

// Leetcode Problem 412

// Fizz Buzz

// Given an integer n, return a string array answer (1-indexed) where:

// answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
// answer[i] == "Fizz" if i is divisible by 3.
// answer[i] == "Buzz" if i is divisible by 5.
// answer[i] == i (as a string) if none of the above conditions are true.
 

// Example 1:

// Input: n = 3
// Output: ["1","2","Fizz"]

// Algorithm

/*
 * Create A Array List of Strings
 * Traverse from 1 to n value
 * As Per conditions if number divides both 3 and 5 add fizzbuzz to list
 * Else if number divides 3 only add fizz to list
 * Number divides only 5 add buzz to list
 * Else Convert number to string and add it to list of string
 * END
 */

 /* ======================================================================================================== */

class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> sub = new ArrayList<>();

        for (int i=1;i<=n;i++)
        {
            if (i%3==0 && i%5==0) sub.add("FizzBuzz");

            else
            {
                if (i%3==0) sub.add("Fizz");

                else if (i%5==0) sub.add("Buzz");

                else sub.add(String.valueOf(i));
            }
        }

        return sub;

    }
}

public class Fizz_Buzz {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();

        scan.close();

        Solution sol = new Solution();

        System.out.println(sol.fizzBuzz(s));


    }
}
