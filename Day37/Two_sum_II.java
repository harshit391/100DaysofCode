package Day37;

// Leetcode Problem 167 

// Two Sum II - Input Array Is Sorted

// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.

// Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

// The tests are generated such that there is exactly one solution. You may not use the same element twice.

// Your solution must use only constant extra space.

// Example 1:

// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

// My Solution
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/solutions/3790824/binary-search-approach-beats-99-java/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        System.out.println(numbers.length);

        int[] index = new int[2];

        for (int i=0;i<numbers.length;i++)
        {
            for (int j=i+1;j<numbers.length;j++)
            {
                if ((numbers[i] + numbers[j])==target)
                {
                    index[0] = i+1;
                    index[1] = j+1;
                    return index;
                }
            }
        }

        return index;
    }
}

public class Two_sum_II {
    
}
