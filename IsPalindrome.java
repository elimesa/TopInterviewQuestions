/*
Input: X = 121
output: true

Inout: x = -121
output: false
* */

public class IsPalindrome {

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(isPalindrome(nums));

        int[] nums2 = {-1,2,1};
        System.out.println(isPalindrome(nums2));

        int[] nums3 = {10};
        System.out.println(isPalindrome(nums3));
    }

    private static boolean isPalindrome(int[] arr) {
        int j = arr.length - 1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[j]) {
                return false;
            }
            j--;
        }
        return true;
    }
}
