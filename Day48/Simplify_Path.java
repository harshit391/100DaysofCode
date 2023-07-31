package Day48;

// Leetcode Problem 71 

// Simplify Path

// Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.

// In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.

// The canonical path should have the following format:

// The path starts with a single slash '/'.
// Any two directories are separated by a single slash '/'.
// The path does not end with a trailing '/'.
// The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
// Return the simplified canonical path.

// Example 1:

// Input: path = "/home/"
// Output: "/home"

// My Solution
// https://leetcode.com/problems/simplify-path/solutions/3843049/beats-99-java-solution/

class Solution {

    public String simplifyPath(String path) {

        // Create a String builder for mutable string
        StringBuilder result = new StringBuilder();

        // Split path using delimiter / and \ using regex
        String[] tokens = path.split("\\/");

        // Iterate through splitted array
        for (String token : tokens) {
            
            // If there comes and empty string or there is period (.) or there is slash (/) 
            if (token.length() == 0 || token.equals(".") || token.equals("/"))
                // continue to avoid these as they had no effect on result
                continue;

            // If there comes a double period 
            if (token.equals("..")) {
                if (result.length() > 0) {
                    // delete the string from last index of / to end 
                    result.delete(result.lastIndexOf("/"), result.length());
                }
            } else {
                // In Normal append a slash and add the string 
                result.append('/');
                result.append(token);
            }
        }

        // If resultant Stringbuilder length is more than 0 return Stringbuilder converted to String else return a slash "/"
        return result.length() > 0 ? result.toString() : "/";
    }
}

public class Simplify_Path {
    
}
