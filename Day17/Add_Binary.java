import java.util.Scanner;

// Leetcode Problem 67

// Add Binary

// Given two binary strings a and b, return their sum as a binary string.

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"

// Algorithm

/**
 * Create a String builder sb for result
 * Initialize carry to 0 and two indexes i and j to a and b lengths respectively
 * Make while loop from i and j to =0 
 * sum will become carry at start
 * if i>=0 sum will add char at i
 * if j>=0 sum will add char at j
 * insert the sum % 2  at 0th postion of sb
 * and make the carry divide by 2
 * At loop end check if carry left if left insert it at 0 index of sb
 * Return the converted String of sb
 * END
 */

 /* ===================================================================================================== */

class Solution {
    public String addBinary(String a, String b) {
        
       StringBuilder sb = new StringBuilder();

       int i = a.length()-1;
       int j = b.length()-1;

       int carry = 0;

       while (i>=0 || j>=0)
       {

           int sum = carry;

           if (i>=0) sum += a.charAt(i) -'0';

           if (j>=0) sum += b.charAt(j)-'0';

           i--;
           j--;
           sb.insert(0,sum%2);
           carry = sum/2;

       }

       if (carry>0) sb.insert(0,carry);

        return sb.toString();

    }
}


public class Add_Binary{

    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();

        String b = scan.next();

        scan.close();

        Solution sol = new Solution();

        System.out.println(sol.addBinary(a, b));
    }
}