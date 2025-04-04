class Kata {
    public static int sumDigits(int number){
        return String.valueOf(number).replaceAll("-", "").chars().boxed().mapToInt(c -> c - 48).sum();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.sumDigits(10));
        System.out.println(Kata.sumDigits(99));
        System.out.println(Kata.sumDigits(-32));
    }
}