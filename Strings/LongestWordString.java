package Strings;


/*
* find the longest word in a string:
* Input: "Java programming language is powerful"
Output: "Longest word: programming"
* */
public class LongestWordString {
    public static void main(String[] args) {
        String value1 = "Java programming language is powerful";
        System.out.println("the longest word is:"+longestWord(value1));
        System.out.println("======");

        String value2 = "Today is the happiest day of my life";
        System.out.println("the longest word is:"+longestWord(value2));
        System.out.println("======");
    }

    private static String longestWord(String value) {
        //validate if the chain is empty
        if(value == null || value.trim().isEmpty()) {
            return "No words available";
        }

        String[] listValue = value.split("\\s+");
        String longestWord = listValue[0];

        for (String word: listValue) {
            if(word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
