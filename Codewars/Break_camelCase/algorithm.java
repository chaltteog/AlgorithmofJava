class Kata {
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.camelCase("camelCasingTest"));
        System.out.println(Kata.camelCase("camelcasingtest"));
    }
} 