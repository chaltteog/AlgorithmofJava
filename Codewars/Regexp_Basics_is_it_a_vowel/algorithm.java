class Kata {
    public static boolean isVowel(String s) {
        return s.matches("^[aeiouAEIOU]$");
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.isVowel(""));
        System.out.println(Kata.isVowel("a"));
        System.out.println(Kata.isVowel("E"));
        System.out.println(Kata.isVowel("ou"));
        System.out.println(Kata.isVowel("z"));
        System.out.println(Kata.isVowel("lol"));
    }
} 