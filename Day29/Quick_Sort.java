package Day29;

import java.util.Scanner;

public class Quick_Sort{
    private static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static int partition(int[] arr, int low, int high)
    {
        int i = low - 1;
        int pivot = arr[high];

        for (int j=low;j<high;j++)
        {
            i++;
            if (arr[j]<pivot) swap(arr,i,j);
        }
        i++;
        swap(arr, i, high);

        return i;
    }

    public static void quickSort(int[] arr, int low, int high)
    {
        if (low<high)
        {
            int pivot = partition(arr,low,high);

            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    private static void print(int[] array)
    {
        for (int a:array) System.out.printf("%d ",a);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter length of Array:- ");
        int length = scan.nextInt();
        System.out.println();


        int[] arr = new int[length];

        System.out.println("Enter Array you want to Sort:- ");
        for (int i=0;i<length;i++)
        {
            arr[i] = scan.nextInt();
        }
        scan.close();
        System.out.println();

        System.out.println("Array Before Sorting:- ");
        print(arr);
        System.out.println();

        quickSort(arr,0,arr.length);

        System.out.println("Array After Sorting:- ");
        print(arr);
    }
}