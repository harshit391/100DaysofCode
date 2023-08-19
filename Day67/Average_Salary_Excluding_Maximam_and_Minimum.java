package Day67;

// Leetcode Problem 1491 

// Average Salary Excluding the Minimum and Maximum Salary

// You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

// Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

// Example 1:

// Input: salary = [4000,3000,1000,2000]
// Output: 2500.00000
// Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
// Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

// My Solution
class Solution {
    public double average(int[] salary) {
        
        int min = salary[0];
        int max = salary[0];

        int b = salary.length - 2;

        double sum = 0;

        for (int a : salary)
        {
            if (a<min) min = a;
            
            if (a>max) max = a;

            sum += a;
        }

        sum -= min;
        sum -= max;

        return sum/b;


    }
}

public class Average_Salary_Excluding_Maximam_and_Minimum {
    
}
