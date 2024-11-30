class Kata {
    public static String getMiddle(String word) {
        int pos = word.length() / 2 - 1;
        return word.length() % 2 == 0 ? word.substring(pos, pos + 2) : word.substring(pos + 1, pos + 2);
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.getMiddle("test"));
        System.out.println(Kata.getMiddle("teset"));
    }
}