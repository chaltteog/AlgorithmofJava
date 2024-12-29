import java.util.Arrays;

class Kata { 
    public static double[] tribonacci(double[] s, int n) {
        double[] arr = Arrays.copyOf(s, n);
        for (int i = 3; i < n; i++) {
            arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1]; 
        }
        return arr;
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.tribonacci(new double []{1,1,1},10)));
        System.out.println(Arrays.toString(Kata.tribonacci(new double []{0,0,1},10)));
        System.out.println(Arrays.toString(Kata.tribonacci(new double []{0,1,1},0)));
        System.out.println(Arrays.toString(Kata.tribonacci(new double []{0,1,1},1)));
        System.out.println(Arrays.toString(Kata.tribonacci(new double []{0,1,1},2)));
        System.out.println(Arrays.toString(Kata.tribonacci(new double []{0,1,1},3)));                
    }
}