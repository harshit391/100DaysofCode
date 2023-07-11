package Day28;

import java.util.Scanner;

public class Merge_Sort {
    public static void conquer(int[] nums,int si,int mid,int ei)
    {
        int[] merged = new int[ei-si+1];

        int idx1 = si;
        int idx2 = mid + 1;
        int idx3 = 0;

        while (idx1<=mid && idx2<=ei)
        {
            if (nums[idx1]<nums[idx2])
            merged[idx3++] = nums[idx1++];

            else merged[idx3++] = nums[idx2++];
        }

        while (idx1<=mid) merged[idx3++] = nums[idx1++];
        while (idx2<=ei) merged[idx3++] = nums[idx2++];

        for (int i=0;i<merged.length;i++) nums[i] = merged[i];
    }

    public static void divide(int[] nums, int si, int ei)
    {
        if (si>=ei) return;

        int mid = si + (ei-si)/2;

        divide(nums,si,mid);
        divide(nums,mid+1,ei);
        conquer(nums,si,mid,ei);
        
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

        divide(arr,0,arr.length);

        System.out.println("Array After Sorting:- ");
        print(arr);
    }
}
