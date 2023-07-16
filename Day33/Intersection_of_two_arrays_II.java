package Day33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leetcode Problem 350 

// Intersection of Two Arrays II

// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]

// My Solution
// https://leetcode.com/problems/intersection-of-two-arrays-ii/solutions/3774385/96-beat-solution-java-easy-way/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        List<Integer> temp = new ArrayList<>();

        int idx1=0;
        int idx2=0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (idx1<nums1.length && idx2<nums2.length)
        {
            if (nums1[idx1]<nums2[idx2])
            idx1++;

            else if (nums1[idx1]>nums2[idx2])
            idx2++;

            else {
                temp.add(nums1[idx1]);
                idx1++;
                idx2++;
            }
        }

        int[] result = new int[temp.size()];
        for (int i=0;i<temp.size();i++)
        {
            result[i] = temp.get(i);
        }

        return result;

    }
}

public class Intersection_of_two_arrays_II {
    
}
