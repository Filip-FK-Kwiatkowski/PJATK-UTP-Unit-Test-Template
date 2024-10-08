public class BasicUtils {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int vowelCount(String str) {
        long count = str.toLowerCase().chars()
                .mapToObj(i -> (char) i)
                .filter(BasicUtils::isVowel)
                .count();

        return (int) count;
    }

    private static boolean isVowel(char c) {
        return "aeio".indexOf(c) != -1;
    }
}
