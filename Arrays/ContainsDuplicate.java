package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1}; //true
        System.out.println(containsDuplicate(nums));

        int[] nums2 = {1,2,3,4}; // false
        System.out.println(containsDuplicate(nums2));

        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};//true
        System.out.println(containsDuplicate(nums3));
    }

    private static boolean containsDuplicate(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                return true;
            }
            map.put(arr[i],1);
        }
        return false;
    }
}
