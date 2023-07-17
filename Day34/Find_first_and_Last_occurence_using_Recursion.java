package Day34;

import java.util.Scanner;

// Find first and Last Occurence of a Character in String Using Recursion

public class Find_first_and_Last_occurence_using_Recursion {
    public static int first = -1;    
    public static int last = -1;


    public static void Fstandlstocc(String s, int idx, char a)
    {
        
        if (idx==s.length()) return;

        if (s.charAt(idx)==a) 
        {
            if (first==-1) first = idx;
            else last = idx;
        }

        Fstandlstocc(s, idx+1, a);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String m = scan.next();

        scan.close();

        char a = m.charAt(0);

        Fstandlstocc(s.toLowerCase(), 0, a);

        System.out.println("First Occurence:- " + first);        
        System.out.println("Last Occurence:- " + last);
    }
}
