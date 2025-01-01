import java.util.concurrent.atomic.AtomicInteger;

class Kata {
    public static long digPow(int n, int p) {
        AtomicInteger idx = new AtomicInteger(p);
		long l = String.valueOf(n).chars().mapToObj(c -> String.valueOf((char) c)).mapToLong(Long::valueOf).map(i -> Math.round(Math.pow(i, idx.getAndIncrement()))).sum();
        return l % n == 0 ? l / n : -1;
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.digPow(89, 1));
        System.out.println(Kata.digPow(92, 1));
        System.out.println(Kata.digPow(46288, 3));
    }
}