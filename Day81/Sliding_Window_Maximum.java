package Day81;

import java.util.ArrayDeque;
import java.util.Deque;

// Leetcode Problem 239 

// Sliding Window Maximum

// You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

// Return the max sliding window.

// Example 1:

// Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]
// Explanation: 
// Window position                Max
// ---------------               -----
// [1  3  -1] -3  5  3  6  7       3
//  1 [3  -1  -3] 5  3  6  7       3
//  1  3 [-1  -3  5] 3  6  7       5
//  1  3  -1 [-3  5  3] 6  7       5
//  1  3  -1  -3 [5  3  6] 7       6
//  1  3  -1  -3  5 [3  6  7]      7

// My Solution
// https://leetcode.com/problems/sliding-window-maximum/solutions/3992377/deque-approach-java/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        // Edge Cases
        if(n == 0 || k == 0) return new int[0];
        if(k == 1) return nums;

        int[] ans = new int[n-k+1];
        int idx = 0;

        // We basically have to store the index of max at first and next max element index from the last to track both simultaneously
        // Thats where the deque magic comes
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0;i<n;i++) {
            // Now If max index is not in current window remove that index
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) deque.pollFirst();

            // If the current element is larger than the second max index stored in last
            // Remove that index from last 
            // We basically have to store the index of number which are greater than current maximum in deque or greater than elements in current window
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) deque.pollLast();

            // Add current index at last of deque 
            deque.offerLast(i);

            // When i becomes lareger than k-1 index just start adding elements at top of deque which contain the index of elements which are max in their respective window
            if (i >= k - 1) {
                ans[idx++] = nums[deque.peekFirst()];
            }
        }

        return ans;
    }
}

public class Sliding_Window_Maximum {
    
}
