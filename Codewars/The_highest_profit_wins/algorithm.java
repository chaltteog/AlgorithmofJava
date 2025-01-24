import java.util.Arrays;

class Kata {
    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        return new int[] {arr[0], arr[arr.length - 1]};
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.minMax(new int [] {2,1})));
        System.out.println(Arrays.toString(Kata.minMax(new int [] {1,2,3,4,5})));
        System.out.println(Arrays.toString(Kata.minMax(new int [] {2334454,5})));
        System.out.println(Arrays.toString(Kata.minMax(new int [] {1})));
    }
} 