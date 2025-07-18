package Arrays;

import java.util.*;

/*
You are given two integer arrays nums1 and nums2
of sizes n and m, respectively. Calculate the following values:
* answer1 : the number of indices i such that nums1[i] exists in nums2.
answer2 : the number of indices i such that nums2[i] exists in nums1.
Return [answer1,answer2].

*/
public class CommonElements {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 2};
        int[] nums2 = {1, 2};
        int[] result1 = calculateCommonElements(nums1, nums2);
        System.out.println(result1[0] + "," + result1[1]);

        System.out.println("============");
        int[] nums3 = {4, 3, 2, 3, 1};
        int[] nums4 = {2, 2, 5, 2, 3, 6};
        int[] result2 = calculateCommonElements(nums3, nums4);
        System.out.println(result2[0] + "," + result2[1]);

        System.out.println("============");
        int[] nums5 = {3, 4, 2, 3};
        int[] nums6 = {1, 5};
        int[] result3 = calculateCommonElements(nums5, nums6);
        System.out.println(result3[0] + "," + result3[1]);
    }

    private static int[] calculateCommonElements(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int answer1 = 0;
        int answer2 = 0;

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }


        for (int num : nums1) {
            if (set2.contains(num)) {
                answer1++;
            }
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                answer2++;
            }
        }

        return new int[]{answer1, answer2};
    }
}
