class Kata {
    public static int makeNegative(final int x) {
        return x < 1 ? x : x * -1;
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.makeNegative(42));
        System.out.println(Kata.makeNegative(-5));
    }
} 