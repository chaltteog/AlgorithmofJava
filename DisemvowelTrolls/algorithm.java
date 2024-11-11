class Kata {
    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.disemvowel("This website is for losers LOL!"));
    }
}