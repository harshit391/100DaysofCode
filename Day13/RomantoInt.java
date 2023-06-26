/*Leet Code Problem 13 */

// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.

// Example 1:

// Input: s = "III"
// Output: 3
// Explanation: III = 3.

/** Algorithm
* Creating a reverse character array of the entered string
* Making a function defining values of every Roman Number
* Making a priority array of Roman Numbers as {'I','V','X','L','C','D','M'}
* Making a function to find index of character according to priority
* If index of element is less than or equal to its next element then increment the sum value by its Roman Value
* Else decrement the value
* Return Sum
*/

/* ======================================================================================================== */
import java.util.*;

class Solution {

    /*Function to return the index of the character as per priority so that we know when we have to subtract the value */

    public int findindex(char s)
    {
        int index = 0;
        char priority_array[] = {'I','V','X','L','C','D','M'};

        for (int i=0;i<7;i++)
        {
            if (s == priority_array[i]) {index = i;break;}
        }

        return index;

    }

    /* provide_value provides the value of roman character */

    public int provide_value(char k)
    {
        int value = 0;
        switch(k)
        {
            case 'I' : value = 1;break;
            case 'V' : value = 5;break;
            case 'X' : value = 10;break;
            case 'L' : value = 50;break;
            case 'C' : value = 100;break;
            case 'D' : value = 500;break;
            case 'M' : value = 1000;break;
        }

        return value;
    }

    public int romanToInt(String s) {
        
        char arr[] = new char[s.length()];

        /*Creating a reverse character array of string */
        for (int i=0;i<s.length();i++)
        {
            arr[i] = s.charAt(s.length()-i-1);
        }

        int sum = 0;

        /*Adding the very first value so that it shouldn't get left */
        sum += provide_value(arr[0]);

        /*Checking index and incrementing or decrementing value of sum as per conditions */
        for (int i=0;i<arr.length-1;i++)
        {
            if (findindex(arr[i])<=findindex(arr[i+1])) sum += provide_value(arr[i+1]);
            else sum -= provide_value(arr[i+1]); 
        }

        return sum;

    }
    
}
public class RomantoInt{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        scan.close();

        Solution sol = new Solution();

        int integer_value = sol.romanToInt(s);

        System.out.println(integer_value);


    }
}
