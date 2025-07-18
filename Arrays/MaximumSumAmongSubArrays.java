package Arrays;

/*

Given an integer array, find the maximum sum among all its subarrays.

Input : [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: The maximum sum subarray is [4, -1, 2, 1]

Input : [-7, -3, -2, -4]
Output: -2
Explanation: The maximum sum subarray is [-2]

Input : [-2, 2, -1, 2, 1, 6, -10, 6, 4, -8]
Output: 10
Explanation: The maximum sum subarray is [2, -1, 2, 1, 6] or [6, 4] or [2, -1, 2, 1, 6, -10, 6, 4]

*/
public class MaximumSumAmongSubArrays {
    public static void main(String[] args) {
        int[] num1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(calculateMaximumSum(num1));

        System.out.println("=============");
        int[] num2 = {-7, -3, -2, -4};
        System.out.println(calculateMaximumSum(num2));

        System.out.println("=============");
        int[] num3 = {-2, 2, -1, 2, 1, 6, -10, 6, 4, -8};
        System.out.println(calculateMaximumSum(num3));
    }

    private static int calculateMaximumSum(int[] num) {
        int max_current = num[0];
        int max_global = num[0];
        for (int j : num) {
            max_current = Math.max(j, max_current + j);
            max_global = Math.max(max_global, max_current);
        }

        return max_global;
    }
}
