package Strings;

/*To determine if two strings are anagrams, we need to check whether they contain exactly
the same characters with the same frequency. Here’s an efficient approach to solve this:

Approach: Check the lengths of both strings. If the lengths are different,
they cannot be anagrams. Sort the characters in both strings and compare them.
If the sorted versions of the strings are identical, then the strings are anagrams.
Alternatively, we can count character frequencies in each string and compare the frequency
distributions. If they match, the strings are anagrams.*/

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String value1 = "silent";
        String value2 = "listen";

        System.out.println(isAnagram(value1, value2));
    }

    private static boolean isAnagram(String value1, String value2) {
        if (value1.length() != value2.length()) {
            return false;
        }
        char[] charactersValue1 = value1.toCharArray();
        char[] charactersValue2 = value2.toCharArray();
        Arrays.sort(charactersValue1);
        value1 = Arrays.toString(charactersValue1);

        Arrays.sort(charactersValue2);
        value2 = Arrays.toString(charactersValue2);

        return value1.compareTo(value2) <= 0;
    }
}
