package Day56;

// Imagine if there is a Infinite array And we have to Find an element using binary Search

// Amazon Question

public class Position_of_an_element_in_Infinite_Array {
    
    public static int bnrysrch(int[] arr, int left, int right, int target)
    {
        while (left<=right)
        {
            int mid = left + (right-left)/2;

            if (arr[mid]<target) left = mid +1;

            else if (arr[mid]>target) right = mid-1;

            else return mid;
        }

        return -1;
    }

    public static void main(String[] args)
    {
        // Just for try 
        // Imagine If there will be an infinite array
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int target = 14;

        // Main Intution
        // Sliding Window

        // Starting with size of 2 in sliding window containing first and second element of array
        // Apply Binary Search in that window and if element present return it 

        // Else Increase Sliding window size by double of its previous
        // Also Make the start index one level up to the end index as we already checked that window

        int start = 0;
        int end = 1;

        while (target>arr[end])
        {
            int temp = end + 1;
            end += (end-start+1)*2; // Doubling the size of Sliding window
            start = temp;
        }


        int x = bnrysrch(arr, start, end, target);
        if (x==-1) System.out.println("Element not Present");

        System.out.println("Element present at "+ x + " index");
        
    }

}
