package Day76;

import java.util.Scanner;

// Implement Binary Seach Using Recursion

public class binary_search_using_recursion {

    static int search(int start, int end, int[] arr, int target)
    {
        if (start > end) return -1;

        int mid = start + (end-start)/2;
        
        if (arr[mid] == target) return mid;

        else if (arr[mid] < target) return search(mid+1, end, arr, target);

        return search(start, mid-1, arr, target);

    }
    public static void main(String[] args) {
        
        int[] arr = {4,5,6,7,8,9,1,2};

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        scan.close();

        System.out.println(search(0, arr.length-1, arr, n));
    }

}
