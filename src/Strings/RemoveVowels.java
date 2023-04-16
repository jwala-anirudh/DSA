package Strings;

public class RemoveVowels {
    public static void main(String[] args) {
        String str = "Welcome to Anirudh Jwala";
        String vowels = "AEIOUaeiou";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}
