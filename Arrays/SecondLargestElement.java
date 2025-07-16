package Arrays;/*
* Given an array of integers, our task is to write a program that efficiently finds the second-largest element present in the array.
Input: arr[] = {12, 35, 1, 10, 34, 1}
Output: The second largest element is 34.
Explanation: The largest element of the array is 35 and the second largest element is 34

Input: arr[] = {10, 5, 10}
Output: The second largest element is 5.
Explanation: The largest element of the array is 10 and the second largest element is 5



Input: arr[] = {10, 10, 10}
Output: The second largest does not exist.
Explanation: Largest element of the array is 10 there is no second largest element*/

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] nums = {12, 35, 1, 10, 34, 1};
        System.out.println(findSecondLargest(nums));

        int[] nums2 = {10, 5, 10};
        System.out.println(findSecondLargest(nums2));

        int[] nums3 = {10, 10, 10};
        System.out.println(findSecondLargest(nums3));
    }

    private static int findSecondLargest(int[] arr) { //O(N)
        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElement) {
                secondLargestElement = largestElement;
                largestElement = arr[i];
            } else if(arr[i] < largestElement && arr[i] > secondLargestElement) {
                secondLargestElement = arr[i];
            }
        }

        return secondLargestElement;
    }
}
