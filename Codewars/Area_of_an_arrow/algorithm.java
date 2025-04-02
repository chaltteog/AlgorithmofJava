class Kata {
    public static double arrowArea(int a, int b) {
        return (a * b) / (double) 4;
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.arrowArea(4, 2));
        System.out.println(Kata.arrowArea(7, 6));
        System.out.println(Kata.arrowArea(25, 25));
    }
} 