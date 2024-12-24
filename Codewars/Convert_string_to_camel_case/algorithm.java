import java.util.Arrays;
import java.util.stream.Collectors;

class Kata {
    public static String toCamelCase(String s){
        return s.length() > 0 ? s.substring(0, 1) + 
                                Arrays.stream(s.split("-"))
                                      .map(x -> Arrays.stream(x.split("_")).map(y -> y.substring(0, 1).toUpperCase() + y.substring(1, y.length())).collect(Collectors.joining("")))
                                      .collect(Collectors.joining("")).substring(1) : "";
    }
}

/* Best Answer
 * String[] words = str.split("[-_]");
 * return Arrays.stream(words, 1, words.length)
 *              .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
 *              .reduce(words[0], String::concat);
 */

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.toCamelCase("the_Stealth_Warrior"));
        System.out.println(Kata.toCamelCase("The_Stealth_Warrior"));
        System.out.println(Kata.toCamelCase("The_Stealth-Warrior"));
        System.out.println(Kata.toCamelCase("the"));
        System.out.println(Kata.toCamelCase(""));
    }
}