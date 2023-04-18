package Strings;

public class LeetCode709 {
    public String toLowerCase(String s) {
        char[] characters = s.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            char ch = characters[i];

            if (ch >= 'A' && ch <= 'Z') {
                characters[i] = (char)(ch - 'A' + 'a');
            }
        }

        return new String(characters);
    }
}
