package Day32.Recursion_Basic;

import java.util.*;

// Print Numbers from n to 1

public class one {

    public static void print(int n)
    {
        if (n==0) return;

        System.out.println(n);

        print(n-1);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n  = scan.nextInt();

        scan.close();

        print(n);
    }


}
