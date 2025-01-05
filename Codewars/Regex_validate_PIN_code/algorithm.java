class Kata {
    public static boolean validatePin(String pin) {
        return pin.matches("(^\\d{6}$|^\\d{4}$)");
	}
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.validatePin("1234"));
        System.out.println(Kata.validatePin("10"));
        System.out.println(Kata.validatePin("000000"));
        System.out.println(Kata.validatePin("a234"));
        System.out.println(Kata.validatePin(".234"));
        System.out.println(Kata.validatePin("-1234"));
        System.out.println(Kata.validatePin("1.234"));
    }
}