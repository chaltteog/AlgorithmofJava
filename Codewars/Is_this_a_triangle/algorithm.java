import java.util.Arrays;

class Kata {
    public static boolean isTriangle(int a, int b, int c){
        int[] arr = Arrays.stream(new int[] {a, b, c}).filter(i -> i > 0).sorted().toArray();
        return arr.length == 3 ? arr[2] < arr[0] + arr[1] : false;
    }
}

/* Best */
// return a + b > c && a + c > b && c + b > a;

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.isTriangle(1, 1, 4));
        System.out.println(Kata.isTriangle(1, 2, 2));
        System.out.println(Kata.isTriangle(-5,1,3));
    }
}