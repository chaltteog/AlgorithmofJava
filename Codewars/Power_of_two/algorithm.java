class Kata {
    public static boolean isPowerOfTwo(long n) {
		return (n & (n - 1)) == 0 && n != 0;
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.isPowerOfTwo(1));
        System.out.println(Kata.isPowerOfTwo(128));
    }
}