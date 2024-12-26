class Kata {
    public static boolean isNarcissistic(int number) {
        return number == String.valueOf(number).chars().mapToObj(c -> String.valueOf((char) c)).mapToInt(Integer::parseInt).map(i -> (int) Math.pow(i, String.valueOf(number).length())).sum() ? true : false;
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.isNarcissistic(153));
        System.out.println(Kata.isNarcissistic(1634));
        System.out.println(Kata.isNarcissistic(1634));
    }
}