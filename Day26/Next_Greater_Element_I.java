package Day26;

import java.util.ArrayList;
import java.util.List;

// Leetcode Problem 496 

// Next Greater Element I

// The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

// You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

// For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

// Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

// Example 1:

// Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
// Output: [-1,3,-1]
// Explanation: The next greater element for each value of nums1 is as follows:
// - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
// - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
// - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.

// For Algorithm Hold Control key and Click on the link below
// https://leetcode.com/problems/next-greater-element-i/solutions/3741510/best-solution-using-basics-and-arraylist/

class Solution {
    private int checkgreater(int[] nums,int index,int value)
    {
        for (int i=index;i<nums.length;i++)
        {
            if (nums[i]>value) return nums[i];
        }

        return -1;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        for (int i=0;i<nums1.length;i++)
        {
            for (int j=0;j<nums2.length;j++)
            {
                if (nums1[i]==nums2[j]) 
                {
                    result.add(checkgreater(nums2,j+1,nums2[j]));
                }
            }
        }

        int[] final_array = new int[result.size()];

        int index = 0;
        for (int a:result)
        {
            final_array[index] = a;
            index++;
        }

        return final_array;


    }
}

public class Next_Greater_Element_I {
    
}
