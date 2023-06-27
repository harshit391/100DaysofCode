import java.util.*;

class Solution {
    public boolean valid_or_not(String s)
    {
        boolean valid = true;

        if (s.length()==0) valid = false;

        else if (s.length()==1)
        {
            if (s.charAt(0)>='0' && s.charAt(0)<='9') valid = true;
            else valid = false;
        }

        else if (s.charAt(0)>'0' && s.charAt(0)<='9') valid = true;

        else if (s.charAt(0)=='-' || s.charAt(0)=='+')
        {
            if (s.charAt(1)>='0' && s.charAt(1)<='9') valid = true;
            else valid = false;
        }

        else {
            for (int i=0;i<s.length()-1;i++)
            {
                if (s.charAt(i)=='0')
                {
                    if (s.charAt(i+1)>'0' && s.charAt(i+1)<='9') valid = true;
                    else valid = false;
                }
            }
        }

        return valid;

    }

    public int countnumber(String s)
    {
        int numbers = 0;

        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='-' || s.charAt(i)=='+') 
            {
                if (i==0) continue;
                else break;
            }
            else if (s.charAt(i)=='.') break;
            else if (s.charAt(i)>='0' && s.charAt(i)<='9') numbers++;
            else break;
        }

        return numbers;
    }


    public int myAtoi(String s) {
        s = s.trim();

        if (!valid_or_not(s)) return 0;

        else{
            long number_from_string = 0;

            int total_numbers_in_string = countnumber(s);

            int[] arr = new int[total_numbers_in_string];

            int index = 0;

            for (int i=0;i<s.length();i++)
            {
                if (s.charAt(i)=='-' || s.charAt(i)=='+') 
                {
                    if (i==0) continue;
                    else break;
                }
                else if (s.charAt(i)>='0' && s.charAt(i)<='9') {arr[index]=s.charAt(i)-'0';index++;}
                else break;
            }
                

        double first_number = Math.pow(10,total_numbers_in_string-1);

        for (int i=0;i<total_numbers_in_string;i++)
        {
            number_from_string += first_number*arr[i];
            first_number/=10;
        }

        if (s.charAt(0)=='-') number_from_string*=-1;

        if (number_from_string < Integer.MIN_VALUE)
        {
            number_from_string = Integer.MIN_VALUE;
        }
        else if (number_from_string > Integer.MAX_VALUE)
        {
            number_from_string = Integer.MAX_VALUE;
        }

        return (int)number_from_string;
    }

    }
}

public class StringtoInteger{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        scan.close();

        Solution sol = new Solution();

        int integer_value = sol.myAtoi(s);

        System.out.println(integer_value);


    }
}
