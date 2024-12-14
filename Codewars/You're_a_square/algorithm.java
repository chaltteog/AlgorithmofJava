class Kata {
    public static  boolean isSquare(int n) {        
        return Math.sqrt(n) % 1 == 0.0;
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.isSquare(3));
        System.out.println(Kata.isSquare(0));
        System.out.println(Kata.isSquare(25));
        System.out.println(Kata.isSquare(26));
        System.out.println(Kata.isSquare(-1));                
    }
}