package Day20;

// Leetcode Prolem 1886

// Determine Whether Matrix Can Be Obtained By Rotation

// Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

// Example 1:

// Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
// Output: true
// Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.

// Algorithm

/**
 * Create a Rotate Function in which firstly transpose the original matrix on place
 * and then reverese all the elements in all rows of matrix which is actual rotation 
 * Then create a seperate check function which check every element of mat is equal to target
 * Now Create a loop which run 4 times as after 4th time rotation it becomes original matrix
 * Every time first rotate and then check 
 * if any one time the check gets true return true
 * At the end return false if check never given true
 * END
 */

 /*====================================================================================================== */

class Solution {
    public void rotate(int[][] mat)
    {
        for (int i=0;i<mat[0].length;i++)
        {
            for (int j=0;j<=i;j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i=0;i<mat[0].length;i++)
        {
            for (int j=0;j<mat[0].length/2;j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat[0].length - j -1];
                mat[i][mat[0].length - j -1] = temp;
            }
        }
        
    }

    public boolean check(int[][] mat, int[][] target)
    {
        for (int i=0;i<mat[0].length;i++)
        {
            for (int j=0;j<mat[0].length;j++)
            {
                if (mat[i][j]!=target[i][j])
                {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean findRotation(int[][] mat, int[][] target) {

        int n = 4;

        while (n-->0)
        {
            rotate(mat);
            if (check(mat,target)) return true;
        }

        return false;
        

    }
}

public class Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation {
    public static void main(String []args)
    {

    }
}
