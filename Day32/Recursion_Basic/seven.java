package Day32.Recursion_Basic;

import java.util.Scanner;

// print pow of x to n with stack height log(n)

public class seven {
    public static int  power(int x, int n)
    {
        if (n==0 || x==1) return 1;

        if (x==0) return 0;

        else 
        {
            if (n%2==0) return power(x, n/2)*power(x, n/2);

            else return x*power(x, n/2)*power(x, n/2);
        }
        
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
