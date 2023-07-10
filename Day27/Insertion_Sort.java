package Day27;

import java.util.Scanner;

public class Insertion_Sort {
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

        for (int i=1;i<length;i++)
        {
            int key = arr[i];
            int j = i - 1;
            
            while (j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }

        System.out.println("Array After Sorting:- ");
        print(arr);
        System.out.println();
    }
}
