class Kata {
    public static int persistence(long n) {
        if (n < 10) { return 0; }
        n = String.valueOf(n).chars().map(i -> i - 48).mapToLong(Long::valueOf).reduce((x, y) -> x * y).getAsLong();

		return persistence(n) + 1; // your code
	}
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.persistence(39));
        System.out.println(Kata.persistence(4));
        System.out.println(Kata.persistence(25));
        System.out.println(Kata.persistence(999));
    }
}