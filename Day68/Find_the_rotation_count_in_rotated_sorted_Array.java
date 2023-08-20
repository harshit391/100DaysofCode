package Day68;

import java.util.Scanner;

// Find the Rotation count in Rotated Sorted Array

// There is an integer array nums sorted in ascending order (with duplicate values).

// Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

// Array may contain Duplicates or not

// Return the Roation count of Array

// Given the array nums after the possible rotation and an integer target

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [4,5,6,0,1,2]
// Output: 3

public class Find_the_rotation_count_in_rotated_sorted_Array {
    static int pivot(int[] nums)
    {

        // All we have to find a index where peak element is present in array 
        // Peak element means the element after its will be less
        // The element before it is less
        // In case of duplicated lets equal cases may be there
        int start = 0;
        int end = nums.length-1;

        while (start<=end)
        {
            int mid = start + (end-start)/2;
            
            // If mid element is greater than mid + 1 then mid element is the peak element
            if (mid < end && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            
            // If mid element is less than mid - 1 then mid -1  element is the peak element
            if (mid > start && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            
            // Now Special Case Start

            // Check for duplicated like start , mid , end element are same then skip start and end But......
            if (nums[start]==nums[mid] && nums[end]==nums[mid])
            {   
                // First check if start is pivot 
                if (nums[start]>nums[start+1]) return start;
                
                // if not increment start by 1
                start++;
                
                // Then check if end is pivot
                if (nums[end]<nums[end-1]) return end-1;
                
                // If not decrement end by 1
                end--;
            }
            else if (nums[start] < nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end]))
            {
                // if start element is less than mid element 
                // OR
                // start and mid element are equal and also mid element is greater than end
                // Signifies pivot lies in right side of mid 
                start = mid +1;
            }
            // Else signifies pivot lies in left side of mid
            else end = mid - 1;
        }
        
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        
        int[] nums = new int[m];

        for (int i=0;i<m;i++)
        nums[i] = scan.nextInt();

        scan.close();

        int k = pivot(nums);

        // Find the pivot and return array last index - pivot index which gives the rotation count

        System.out.println(nums.length-k-1);
    }
}
