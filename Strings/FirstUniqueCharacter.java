package Strings;

import java.util.HashMap;
import java.util.Map;

/*Given a string s, find the first non-repeating character
in it and return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

Constraints:
1 <= s.length <= 105
s consists of only lowercase English letters.*/
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String value1 = "leetcode";
        System.out.println(firstUniqueCharacter(value1));
        System.out.println("=========");

        String value2 = "loveleetcode";
        System.out.println(firstUniqueCharacter(value2));
        System.out.println("=========");

        String value3 = "aabb";
        System.out.println(firstUniqueCharacter(value3));
        System.out.println("=========");
    }

    private static int firstUniqueCharacter(String value1) {

        //if the string is empty or null, return -1
        if (value1 == null || value1.isEmpty()) {
            return -1;
        }
        Map<Character, Integer> charCount = new HashMap<>();

        //first pass: count the frequency of each character
        for (char character : value1.toCharArray()) {
            charCount.put(character, charCount.getOrDefault(character, 0) + 1);
        }

        //second pass: find the first character with frequency 1(non-repeating)
        for (int i = 0; i < value1.length(); i++) {
            //if the character appears only once, return its index
            if (charCount.get(value1.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
