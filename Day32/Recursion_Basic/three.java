package Day32.Recursion_Basic;

import java.util.Scanner;

// print sum of n natrural numbers

public class three {
    public static int sumofn(int n,int a)
    {
        if (n==0) return a;

        a+=n;

        return sumofn(n-1, a);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        scan.close();

        System.out.println(sumofn(n, 0));
    }
}
