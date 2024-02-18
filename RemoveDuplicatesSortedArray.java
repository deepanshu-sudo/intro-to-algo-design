/**
 * Question:
 * Write an algorithm to remove duplicates values from an ordered array of N elements.
 * 
 * Algorithm:
        Start the program.
        Input: nums (a sorted array with duplicates).
        Check if the length of nums is 0 or 1. If so, return the length as there are no duplicates to remove.
        Initialize two pointers: i and j.
        Iterate through the array from index 0 to nums.length - 2:
        a. Compare nums[i] with nums[i+1].
        b. If nums[i] is not equal to nums[i+1], move nums[i] to the position nums[j] and increment j.
        After the loop, move the last element of the original array (nums[nums.length - 1]) to position nums[j].
        Return the value of j as the length of the modified array with duplicates removed.
        End the program.
 */

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int j = 0;

        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]) 
                nums[j++] = nums[i];
        }

        nums[j++] = nums[(nums.length)-1];
        return j;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,3,4,5,5,6,6};
        removeDuplicates(nums);
      }
}