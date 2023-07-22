package Day39;

// Leetcode Problem 59 

// Spiral Matrix II

// Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

// Example 1:

// Input: n = 3
// Output: [[1,2,3],[8,9,4],[7,6,5]]

// My Solution
// https://leetcode.com/problems/spiral-matrix-ii/solutions/3799370/beats-100-simple-java-solution/

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];

        int a = 0;
        int b = n;
        int c = 0;
        int d = n;

        int idx = 1;

        while (d>a && b>c)
        {
            for (int i=a;i<b;i++)
            {
                ans[a][i] = idx;
                idx++;
            }
            a++;

            for (int i=a;i<d;i++)
            {
                ans[i][b-1] = idx;
                idx++;
            }
            b--;

            if (a<d)
            {
                for (int i=b-1;i>=c;i--)
                {
                    ans[d-1][i] = idx;
                    idx++;
                }
                d--;
            }

            if (c<b)
            {
                for (int i=d-1;i>=a;i--)
                {
                    ans[i][c] = idx;
                    idx++;
                }
                c++;
            }
        }

        return ans;

    }
}

public class Spiral_Matrix_II {
    
}
