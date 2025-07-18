package Arrays;

import java.util.Arrays;

/*
* Given an integer array nums,
* rotate the array to the right by k steps, where k is non-negative.


Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]*/
public class RotateArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7};
        int k = 3;
        int[] result = rotateArray(nums1, k);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(result));

        System.out.println("=========");

        int[] nums2 = {-1,-100,3,99};
        int j = 2;
        int[] result2 = rotateArray(nums2, j);
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(result2));
    }

    private static int[] rotateArray(int[] nums1, int k) {
        int n = nums1.length;
        int[] newArray = new int[n];
        k = k % n;
        for(int i = 0; i < n; i++){
            newArray[(i+k) % n] = nums1[i];
        }
        return newArray;
    }
}
