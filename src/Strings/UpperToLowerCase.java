package Strings;

public class UpperToLowerCase {
    public static void main(String[] args) {
        String str = "WelCoMe";
        char[] characters = str.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            char ch = characters[i];

            // Value is capital
            if (ch >= 'A' && ch <= 'Z') {
                char lowerCase = (char)(ch - 'A' + 'a');
                characters[i] = lowerCase;
            }
        }

        System.out.println("Result :: " + new String(characters));
    }
}
