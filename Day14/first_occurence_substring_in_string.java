import java.util.*;

class Solution {
    public int strStr(String haystack, String needle) {

        int found = -1;
        
        int lon = needle.length();

        for (int i=0;i<haystack.length()-lon+1;i++)
        {
            String h_sub = haystack.substring(i,i+lon);
            if (h_sub.compareTo(needle)==0) {found = i;break;}
        }

        return found;
        
    }
}


public class first_occurence_substring_in_string {
    
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        String k = scan.next();

        scan.close();

        Solution sol = new Solution();

        int occurence_index = sol.strStr(s,k);

        System.out.println(occurence_index);


    }
}
