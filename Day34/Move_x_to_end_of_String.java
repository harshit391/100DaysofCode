package Day34;

import java.util.Scanner;

// Move all the x in a string to last in string

public class Move_x_to_end_of_String {
    public static String add(int count)
    {
        String xadding = "x";
        for (int i=1;i<count;i++)
        {
            xadding+="x";
        }

        return xadding;
    }


    public static String movex(String s, int count, int idx)
    {
        if (idx==s.length()) return add(count);

        char currChar = s.charAt(idx);
        if (currChar=='x')
        {
            return movex(s, count+1, idx+1);
        }
        else
        {
            String nextString = movex(s, count, idx+1);
            return s.charAt(idx) + nextString;
        }
    }

    

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        scan.close();

        System.out.println(movex(s, 0, 0));
    }
}
