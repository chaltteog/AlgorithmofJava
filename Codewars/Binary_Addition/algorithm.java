class Kata {
    public static String binaryAddition(int a, int b){
        return Integer.toBinaryString(a + b);
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.binaryAddition(1, 1));
        System.out.println(Kata.binaryAddition(0, 1));
        System.out.println(Kata.binaryAddition(5, 9));
    }
}