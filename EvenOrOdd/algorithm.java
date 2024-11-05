class Kata {
    public static String evenOrOdd(int number) {
        return (number % 2) == 0 ? "Even" : "Odd"; // Place code here;
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.evenOrOdd(1));
        System.out.println(Kata.evenOrOdd(2));
        System.out.println(Kata.evenOrOdd(3));
        System.out.println(Kata.evenOrOdd(0));
        System.out.println(Kata.evenOrOdd(-1));
        System.out.println(Kata.evenOrOdd(-2));
    }
} 