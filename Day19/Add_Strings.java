package Day19;

import java.util.Scanner;

class Solution {
    public String addStrings(String num1, String num2) {

        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();


        while (i>=0 || j>=0)
        {
            int sum = carry;
            if (i>=0) sum += num1.charAt(i) - '0';

            if (j>=0) sum += num2.charAt(j) - '0';

            sb.append(sum%10);
            carry = sum/10;

            i--;
            j--;

        }

        if (carry!=0) sb.append(carry);

        return sb.reverse().toString();

        

    }
}

public class Add_Strings {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String r1 = scan.next();

        String r2 = scan.next();

        scan.close();

        Solution sol = new Solution();

        System.out.println(sol.addStrings(r1, r2));
    }
}
