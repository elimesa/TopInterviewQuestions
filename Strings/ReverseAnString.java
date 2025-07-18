package Strings;

import java.util.Arrays;

public class ReverseAnString {
    public static void main(String[] args) {
        String value1 = "Hello";//olleH
        System.out.println(reverString(value1));
        System.out.println("========");

        String value2 = "Bye";//eyB
        System.out.println(reverString(value2));
        System.out.println("========");

        String value3 = "World";//dlroW
        System.out.println(reverString(value3));
        System.out.println("========");
    }

    private static String reverString(String value) {
        char[] characters = value.toCharArray();//O(N)
        int j = characters.length - 1;
        for (int i = 0; i < value.length() / 2; i++) {
            char aux = characters[i];
            characters[i] = characters[j];
            characters[j] = aux;
            j--;
        }
        return Arrays.toString(characters);
    }
}
