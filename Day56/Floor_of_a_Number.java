package Day56;

import java.util.Scanner;

// find the largest number which is smaller than or equal to the target number in a sorted array

public class Floor_of_a_Number {
    public static int ceil(int[] arr, int target)
    {
        if (arr[0]>target) return arr[0];

        if (arr[arr.length-1]<target) return arr[arr.length-1];

        int left = 0;
        int right = arr.length-1;

        while (left<=right)
        {
            int mid = left + (right-left)/2;

            if (target>arr[mid]) left = mid + 1;

            else if (target<arr[mid]) right = mid - 1;

            else return arr[mid];
        }

        return arr[right];

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter the Length of array:- ");
        int m = scan.nextInt();
        System.out.println();

        int[] arr = new int[m];

        System.out.println("Enter the Sorted Array:- ");
        for (int i=0;i<m;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println();

        System.out.printf("Enter the Target Number:- ");
        int n = scan.nextInt();
        System.out.println();

        scan.close();

        System.out.println("Ceiling of the target number in Input Array :- "+ ceil(arr, n));

    }
}
