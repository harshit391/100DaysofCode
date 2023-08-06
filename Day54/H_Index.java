package Day54;

// Leetcode Problem 274 

// H-Index

// Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

// According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.

// Example 1:

// Input: citations = [3,0,6,1,5]
// Output: 3
// Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
// Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.

// My Solution
// https://leetcode.com/problems/h-index/solutions/3872032/beats-100-easy-binary-search-java/

class Solution {
    private boolean isPossible(int[] n, int a)
    {
        int count = 0;

        for (int k : n)
        {
            if (k>=a) count++;
        }

        return count>=a?true:false;
    }


    public int hIndex(int[] citations) {
        int ans = 0;

        // We start from 1 number till the length of citations array

        // Remeber we are not using indexes here so not 0 start from 1
        int low = 1;
        int high = citations.length;


        while (low<=high)
        {
            // record the mid of low and high
            int mid = low + (high-low)/2;
            
            // Check how many citations recived for the middle element  
            if (isPossible(citations,mid))
            {
                // If count of those elements is more than mid element itself

                // Update low by mid + 1 and update the ans by mid element
                low = mid+1;
                ans = mid;
            }
            else 
            {
                // Else Update the high by mid - 1 element
                high = mid-1;
            }
        }

        return ans;
    }
}

public class H_Index {
    
}
