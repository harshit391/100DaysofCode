package Day70;

// Cyclic Sort is only efficient or be used if we have range from 1 to N where N is length of array

public class Cyclic_Sort {
    public static void main(String[] args)
    {
        int[] nums = {3,5,2,1,4};

        int i=0;
        
        while (i<nums.length)
        {
            int correct = nums[i]-1;
            if (nums[i]!=nums[correct])
            {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else i++;
        }

        for (int k : nums)
        System.out.printf("%d ",k);
    }
}
