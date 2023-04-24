package Hashing;

public class HashingStringBasics {

    /**
     * We are going only for lower case characters
     * <p>
     * ASCII values
     * a ----> 97
     * A ----> 65
     * <p>
     * source: http://sticksandstones.kstrom.com/appen.html
     */
    static void hashingLowerCase(String str, char[] lookup) {
        // pre-compute
        int[] hashArr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            hashArr[str.charAt(i) - 'a']++;
        }

        // fetch
        for (char search : lookup) {
            System.out.println(search + " is occurring " + hashArr[search - 'a'] + " no of times");
        }
    }

    static void hashingAllCharacters(String str, char[] lookup) {
        // pre-compute
        int[] hashArr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            hashArr[str.charAt(i)]++;
        }

        // fetch
        for (char search : lookup) {
            System.out.println(search + " is occurring " + hashArr[search] + " no of times");
        }
    }

    public static void main(String[] args) {
        String str = "abcdabehf";
        char[] lookup = {'a', 'g', 'h', 'b', 'c'};

        hashingLowerCase(str, lookup);
        System.out.println("=================");
        hashingAllCharacters(str, lookup);
    }
}
