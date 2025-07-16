/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

NOte: that you must do this in-place without making a cipy of the array
* */

//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

//Input: nums = [0]
//Output: [0]

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] result = moveZeroes(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        System.out.println("=======================");

        int[] nums2 = {0};
        int[] result2 = moveZeroes(nums2);
        for (int i = 0; i < result2.length; i++) {
            System.out.println(i);
        }
    }

    private static int[] moveZeroes(int[] nums) {
        //traverse Array
        int numOfZeroes = 0;
        int k = 0;

        for(int i = 0; i < nums.length; i++) {// O(N)
            if(nums[i] == 0) {
                numOfZeroes ++;
            } else {
                nums[k] = nums[i];
                k++;
            }
        }

        for(int j = 0; j < numOfZeroes; j++) {// O(N)
            nums[k++] = 0;
        }

        return nums;
    }
}
