package Day32.Recursion_Basic;

import java.util.Scanner;

// print fibonacci till nth term

public class five {

    public static void fibonacci(int a, int b, int c)
    {
        if (c==0) return;

        System.out.println(a);

        fibonacci(b, a+b, c-1);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        scan.close();

        fibonacci(0, 1, n);


    }

}
