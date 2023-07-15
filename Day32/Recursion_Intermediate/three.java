package Day32.Recursion_Intermediate;

import java.util.Scanner;

// Reverse a String

public class three {
    public static String reverseString(String s)
    {
        if (s.length()==1) return s;

        char currChar = s.charAt(0);
        String nextString = reverseString(s.substring(1));

        return nextString + currChar;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        scan.close();

        System.out.println(reverseString(name));


    }

}
