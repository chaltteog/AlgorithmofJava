class Kata {
    public static String reverseWords(final String original) {
        String[] sList = original.split(" ");
        int n = 0;

        if (sList.length == 0) { return original; }

        for (String word : sList) {
            sList[n] = new StringBuffer(word).reverse().toString();
            n ++;
        }

        return  "|" + String.join(" ", sList) + "|";
    }
}

/**
 * Best Answer
 *   public static String reverseWords(final String original)
 *  {
 *    return original.trim().isEmpty() ? original : Stream.of(original.split(" "))
 *                .map(word -> new StringBuffer(word).reverse())
 *                .collect(Collectors.joining(" "));
 *  }
*/

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.reverseWords("The quick brown fox jumps over the lazy dog."));
        System.out.println(Kata.reverseWords("elppa"));
        System.out.println(Kata.reverseWords("    "));
    }
}