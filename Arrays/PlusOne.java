package Arrays;

import java.util.Arrays;

/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].*/


public class PlusOne {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] result1 = plusOne(nums1);
        System.out.println(Arrays.toString(result1));

        int[] nums2 = {4, 3, 2, 1};
        int[] result2 = plusOne(nums2);
        System.out.println(Arrays.toString(result2));

        int[] nums3 = {9};
        int[] result3 = plusOne(nums3);
        System.out.println(Arrays.toString(result3));
    }

    private static int[] plusOne(int[] nums1) {
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (nums1[i] < 9) {
                nums1[i]++;
                return nums1;
            }
            nums1[i] = 0;
        }
        int[] newValue = new int[nums1.length + 1];
        newValue[0] = 1;
        return newValue;
    }
}
