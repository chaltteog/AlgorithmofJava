class Kata {
    public static boolean isLucky(long n) {
        int num = String.valueOf(n).chars().mapToObj(c -> String.valueOf((char) c)).mapToInt(Integer::valueOf).sum() % 9;
        return num == 0;
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.isLucky(0));
    }
} 