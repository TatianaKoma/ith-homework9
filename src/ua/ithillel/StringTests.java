package ua.ithillel;

import java.util.Locale;

public class StringTests {
    public static void main(String[] args) {
        String str = "I have been learning English for 5 years.";
        String source = "Apolo";
        String target = "polo";
        String palindrome = "Madam";
        System.out.println(findSymbolOccurrence(str, 'e'));
        System.out.println(findWordPosition(source, target));
        System.out.println(stringReverse(source));
        System.out.println(isPalindrome(palindrome));
    }

    public static int findSymbolOccurrence(String str, char ch) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        if (source.contains(target)) {
            return source.indexOf(target);
        }
        return -1;
    }

    public static String stringReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static boolean isPalindrome(String text) {
        String corrected = text.replaceAll("\\s+", "").toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder(corrected);
        StringBuilder reverse = sb.reverse();
        return (reverse.toString()).equals(corrected);
    }
}
