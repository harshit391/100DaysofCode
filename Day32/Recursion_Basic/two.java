package Day32.Recursion_Basic;

import java.util.Scanner;

// Print numbers from 1 to 5

public class two {

    public static void print(int n,int a)
    {
        if (n==a+1) return;

        System.out.println(n);

        print(n+1,a);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n= scan.nextInt();

        scan.close();

        print(1,n);
    }

}
