package Day33;

// Leetcode Problem 605

// Can Place Flowers

// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

// Example 1:

// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true

// My Solution 
// https://leetcode.com/problems/can-place-flowers/solutions/3774323/easy-solution-beating-99-java-solution-in-o-n/

class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        if (flowerbed.length==1 && flowerbed[0]==0 && n==1) return true;
        else if (flowerbed.length==1 && flowerbed[0]==1 && n==0) return true;
        else if (flowerbed.length==1 && flowerbed[0]==0 && n==0) return true;
        else if (flowerbed.length==1 && flowerbed[0]==1 && n==1) return false;

        if (flowerbed[0]==0 && flowerbed[1]==0) {flowerbed[0]=1;count++;}
        if (flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0) 
        {
            flowerbed[flowerbed.length-1]=1;
            count++;
        }

        for (int i=1;i<flowerbed.length-1;i++)
        {
            if (flowerbed[i]==0)
            {
                if (flowerbed[i-1]==0 && flowerbed[i+1]==0)
                {
                    flowerbed[i]=1;
                    count++;
                }
            }
        }

        return count>=n;
    }
}

public class Can_place_Flowers {
    
}
