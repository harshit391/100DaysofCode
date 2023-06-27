package Day14;

import java.util.Scanner;

class Solution {
    public double myPow(double x, int n) {

        if (n==0) return 1;

        else if (x==1.00000) return 1;

        else if (x==0) return 0;

        else {

        if (n<0) {
            x = 1.0/x;
            if (n == Integer.MIN_VALUE) {
                x *= x;
                n /= 2;
            }
            n=-n;
        }

        double result = 1.0;

        double current = x;

        while (n > 0) {
            if (n % 2 == 1) {
                result *= current;
            }
            current *= current;
            n /= 2;
        }

        return result;
        }
        
    }
}

public class My_Pow {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        double s = scan.nextDouble();

        int n = scan.nextInt();

        scan.close();

        Solution sol = new Solution();

        double value = sol.myPow(s,n);

        System.out.println(value);


    }
}
