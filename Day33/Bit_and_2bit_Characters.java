package Day33;

// 717. 1-bit and 2-bit Characters

// We have two special characters:

// The first character can be represented by one bit 0.
// The second character can be represented by two bits (10 or 11).
// Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.

// Example 1:

// Input: bits = [1,0,0]
// Output: true
// Explanation: The only way to decode it is two-bit character and one-bit character.
// So the last character is one-bit character.

// My Solution 
// https://leetcode.com/problems/1-bit-and-2-bit-characters/solutions/3774189/beats-100-easiest-solution-java/

class Solution {
    public boolean isOneBitCharacter(int[] bits) {

        if (bits.length==1)
        {
            if (bits[0]==0) return true;
            else return false;
        }

        int a = 0;
        for (int i=0;i<bits.length-1;)
        {
            if (bits[i]==0) {i++;a=i;}

            if (bits[i]==1) {i+=2;a=i;}
        }

        if (a<=bits.length-1) return true;

        return false;

    }
}

public class Bit_and_2bit_Characters{

}

