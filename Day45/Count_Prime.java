package Day45;

// Leetcode Problem 204 

// Count Primes

// Given an integer n, return the number of prime numbers that are strictly less than n.

// Example 1:

// Input: n = 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

// My Solution
// https://leetcode.com/problems/count-primes/solutions/3829385/beats-98-java-solution/

class Solution {
    public int countPrimes(int n) {
        
        if( n <=2) // As we know 2 is a lest prime number so if n is less than or equal to 2 then just return 0
        return 0;
        
        int c= 1; // To track the number of primes
        
        // Boolean array to set the number as index less than n checking if its prime or not
        boolean isNotPrime[] = new boolean[n+1]; 
        
        
        
        for(int i=3;i*i<=n;i=i+2) {
            
            if(isNotPrime[i]) {
                // If the number has already value of true then continue
                continue;
            }
            
            for(int j= i*i ;j<=n;j=j+2*i) {
                // Else set the value of that element true meaning it is not prime
                isNotPrime[j] = true;
            } 
                        
        }
        
        for(int i =3;i<n;i=i+2){
    
            // If in boolean array the value is false means it is prime 
            if(!isNotPrime[i]) {
                // increment c by 1
                c++;
            }
        }
    
    
        return c;
        
    }
    }

public class Count_Prime {
    
}
