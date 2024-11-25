class Kata {
    public static int countBits(int n) {
        return Integer.toBinaryString(n)
                      .chars()
                      .map(c -> Integer.parseInt(String.valueOf((char) c)))
                      .sum();
	}
}

/* Best Answer
 *
 * public static int countBits(int n) {
 *     return Integer.bitCount(n);
 * }
 * 
 */

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.countBits(1234));
        System.out.println(Kata.countBits(10));
    }
}