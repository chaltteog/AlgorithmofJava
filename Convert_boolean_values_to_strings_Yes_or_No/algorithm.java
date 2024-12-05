class Kata {
    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.boolToWord(true));
        System.out.println(Kata.boolToWord(false));
    }
}