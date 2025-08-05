package Strings;

public class DeriveString {
    public static void main(String[] args) {
        String value1 = "ABCD";
        String derived1 = "DABC";
        System.out.println(isDerivedValue(value1, derived1));
    }

    private static boolean isDerivedValue(String value1, String value2) {
        int n = value1.length();
        for (int i = 0; i < n; i++) {

            if (value1.equals(value2)) {
                return true;
            }

            char lastValue = value1.charAt(value1.length() - 1);
            value1 = lastValue + value1.substring(0, value1.length() - 1);
        }
        return false;
    }
}
