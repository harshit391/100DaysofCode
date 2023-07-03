package Day20;

// Leetcode Problem 551

// Student Attendance Record I

// You are given a string s representing an attendance record for a student where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:

// 'A': Absent.
// 'L': Late.
// 'P': Present.
// The student is eligible for an attendance award if they meet both of the following criteria:

// The student was absent ('A') for strictly fewer than 2 days total.
// The student was never late ('L') for 3 or more consecutive days.
// Return true if the student is eligible for an attendance award, or false otherwise.

// Example 1:

// Input: s = "PPALLP"
// Output: true
// Explanation: The student has fewer than 2 absences and was never late 3 or more consecutive days.

// Algorithm

/**
 * Using contain method if string contain "LLL" return false
 * else set count absent to 0
 * iterate from 0 to string length
 * check each character in string and wherever char is 'A' incerement count absent by 1
 * if count_absent become more than 1 return false
 * Else at the end Return True
 * END
 */

/* ================================================================================================= */

class Solution {
    public boolean checkRecord(String s) {

        if (s.contains("LLL")) return false;

        int count_absent = 0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='A') count_absent++;
            if (count_absent>1) return false;
        }

        return true;

    }
}

public class Student_Attendence_Record_I {
    
}
