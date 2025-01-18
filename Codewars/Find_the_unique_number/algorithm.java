import java.util.Arrays;

class Kata {
    public static double findUniq(double arr[]) {
        return Arrays.stream(arr).distinct().filter(d -> Arrays.stream(arr).filter(n -> d == n).count() == 1).toArray()[0];
	}
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.findUniq(new double[]{0, 1, 0}));
        System.out.println(Kata.findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }
}