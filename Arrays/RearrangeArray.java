package Arrays;
/*

Given an array of positive and negative integers, in-place segregate them in linear time and constant space. The output should contain all negative numbers, followed by all positive numbers.

Input : [9, -3, 5, -2, -8, -6, 1, 3]
Output: [-3, -2, -8, -6, 9, 5, 1, 3] or [-3, -2, -8, -6, 9, 5, 1, 3] or any other valid combination.

Input : [-4, -2, -7, -9]
Output: [-4, -2, -7, -9] or any other valid combination.

Input : [2, 4, 3, 1, 5]
Output: [2, 4, 3, 1, 5] or any other valid combination.

*/

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] num1 = {9, -3, 5, -2, -8, -6, 1, 3};
        int[] result1 = rearrangeArray(num1);
        System.out.println(Arrays.toString(result1));
        System.out.println("=======");


        int[] num2 = {-4, -2, -7, -9};
        int[] result2 = rearrangeArray(num2);
        System.out.println(Arrays.toString(result2));
        System.out.println("=======");

        int[] num3 = {2, 4, 3, 1, 5};
        int[] result3 = rearrangeArray(num3);
        System.out.println(Arrays.toString(result3));
        System.out.println("=======");
    }

    private static int[] rearrangeArray(int[] arr) {
        int j = arr.length - 1;
        int valAux = 0;
        int i = 0;

        while (i < j) {
            if (arr[i] > 0 && arr[j] < 0) {
                valAux = arr[i];
                arr[i] = arr[j];
                arr[j] = valAux;
            }

            if(arr[i] < 0) {
                i++;
            }

            if(arr[j] > 0) {
                j--;
            }
        }
        return arr;
    }
}
