package Day32.Recursion_Basic;

import java.util.Scanner;

// print factorial of n

public class four {
    public static int factorial(int n, int a)
    {
        if (n==1) return a;

        else a*=n;

        return factorial(n-1, a);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        scan.close();

        System.out.println(factorial(n, 1));
    }
    
}
