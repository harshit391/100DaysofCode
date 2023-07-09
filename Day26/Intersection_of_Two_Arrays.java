package Day26;

import java.util.HashSet;
import java.util.Set;

// Leetcode Problem 349 

// Intersection of Two Arrays

// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]

//  For Algorithm Hold Control Key and Click on the Link Below
//  https://leetcode.com/problems/intersection-of-two-arrays/solutions/3741428/easy-understandable-and-proper-explained-solution-using-hashset/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> temp = new HashSet<>();

        for (int i=0;i<nums1.length;i++)
        {
            for (int j=0;j<nums2.length;j++)
            {
                if (nums1[i]==nums2[j]) temp.add(nums1[i]);
            }
        }

        int[] result =  new int[temp.size()];

        int index = 0;

        for (int a:temp)
        {
            result[index] = a;
            index++;
        }

        return result;
    }
}

public class Intersection_of_Two_Arrays {
    
}
