package Strings;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        String str = "youcandoit";
        char[] s = str.toCharArray();

        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            while (s[i] != 'a' && s[i] != 'e' && s[i] != 'i' && s[i] != 'o' && s[i] != 'u') {
                i++;
            }

            while (s[j] != 'a' && s[j] != 'e' && s[j] != 'i' && s[j] != 'o' && s[j] != 'u') {
                j--;
            }

            if (i >= j) {
                break;
            }

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }

        System.out.println(new String(s));
    }
}
