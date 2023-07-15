package Day32.Recursion_Intermediate;

// Print String in Reverse

import java.util.Scanner;

public class two {
    public static void reverse(String s, int a)
    {
        if (a==-1) return;

        System.out.print(s.charAt(a));

        reverse(s, a-1);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        scan.close();

        reverse(name, name.length()-1);
    }
}
