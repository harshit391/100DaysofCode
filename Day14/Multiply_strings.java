package Day14;

import java.math.BigInteger;
import java.util.Scanner;

class Solution {

    public String multiply(String num1, String num2) {

        BigInteger number1 = new BigInteger(num1);

        BigInteger number2 = new BigInteger(num2);

        BigInteger result = number1.multiply(number2);

        return result.toString();

    }
}

public class Multiply_strings {

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        String k = scan.next();

        scan.close();

        Solution sol = new Solution();

        String result = sol.multiply(s,k);

        System.out.println(result);


    }
    
}
