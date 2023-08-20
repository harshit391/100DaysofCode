package Day68;

import java.util.Scanner;

// Search in Rotated Sorted Array with Duplicated

// There is an integer array nums sorted in ascending order (with duplicate values).

// Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

// Return any index if number is duplicated

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [4,4,4,0,1,1], target = 0
// Output: 3

public class Search_in_Rotated_Sorted_array_with_Duplicates {
    static int bnr(int[] nums, int start, int end, int target)
    {
        // Normal Binary Search Function

        while (start<=end)
        {
            int mid = start + (end-start)/2;

            if (nums[mid]>target) end = mid - 1;

            else if (nums[mid]<target) start = mid + 1;

            else return mid;
        }

        return -1;
    }

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

    static int search(int[] nums, int target) {

        int mid = pivot(nums);

        // If array is not rotated just apply simple binary search
        if (mid==-1) return bnr(nums,0,nums.length-1,target);

        // If pivot is target return it
        if (nums[mid]==target) return mid;

        // If start of array is larger than target it means target lies in right side of pivot index
        if (nums[0]>target) return bnr(nums, mid+1, nums.length-1, target);

        // Else just return searching in left side of array
        return bnr(nums, 0, mid, target);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        
        int[] nums = new int[m];

        for (int i=0;i<m;i++)
        nums[i] = scan.nextInt();

        int target = scan.nextInt();

        scan.close();

        System.out.println(search(nums, target));
    }
}
