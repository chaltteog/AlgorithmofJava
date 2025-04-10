class Kata {
    public static long filterString(final String value) {
        return Long.valueOf(value.replaceAll("[a-zA-Z]", ""));
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.filterString("123"));
        System.out.println(Kata.filterString("a1b2c3"));
        System.out.println(Kata.filterString("aa1bb2cc3dd"));
    }
} 