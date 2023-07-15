package Day32.Recursion_Intermediate;

// Tower of Hanoi

// Tower of Hanoi is a mathematical puzzle where we have three rods (A, B, and C) and N disks. 
// Initially, all the disks are stacked in decreasing value of diameter 
// the smallest disk is placed on the top and they are on rod A. 
// The objective of the puzzle is to move the entire stack to another rod (here considered C), 
// obeying the following simple rules: 

// Only one disk can be moved at a time.
// Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
// No disk may be placed on top of a smaller disk.
// Examples:

// Input: 2
// Output: Disk 1 moved from A to B
// Disk 2 moved from A to C
// Disk 1 moved from B to C

// Input: 3
// Output: Disk 1 moved from A to C
// Disk 2 moved from A to B
// Disk 1 moved from C to B
// Disk 3 moved from A to C
// Disk 1 moved from B to A
// Disk 2 moved from B to C
// Disk 1 moved from A to C

public class one {
    public static void hanoi(int n, String src, String helper, String dest)
    {
        if (n==1) {
        System.out.println("Disk " + n + " Transferend from " + src + " to " + dest);
        return;
        }
        
        hanoi(n-1, src, dest, helper);
        System.out.println("Disk " + n + " Transferend from " + src + " to " + helper);

        hanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args)
    {
        int n = 4; //Four Rings
        hanoi(n, "A", "B", "C");

    }
}
