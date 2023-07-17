package Day34;

import java.util.Scanner;

// Find if the array is strictly increasing or not

public class Find_array_sorted_or_not {
    public static boolean sorted = true;

    public static void Sortedornot(int[] arr, int idx)
    {
        if (idx == arr.length-1) 
        {
            return;
        }

        if (arr[idx]>arr[idx+1]) 
        {
            sorted = false;
            return;
        }

        Sortedornot(arr, idx+1);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();

        int[] arr = new int[len];

        int i = 0;
        while (len-->0)
        {
            arr[i] = scan.nextInt();
            i++;
        }

        scan.close();

        Sortedornot(arr, 0);

        System.out.println(sorted);

    }

}
