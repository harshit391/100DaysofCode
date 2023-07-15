package Day32.Recursion_Basic;

import java.util.Scanner;

// print x^n with stack height n

public class six {

    public static int power(int x, int n)
    {
        if (n==1) return x;

        if (x==0) return 0;

        if (x==1 || n==0) return 1;
        
        int a = power(x, n-1);
        int xn = x * a;
        
        return xn;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int x  = scan.nextInt();        
        int n  = scan.nextInt();

        scan.close();

        System.out.println(power(x,n));
    }



}
