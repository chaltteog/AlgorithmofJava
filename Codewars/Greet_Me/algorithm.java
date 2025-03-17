class Kata {
    public static String greet(String name){
        return "Hello " + name.substring(0, 1).toUpperCase() + name.substring(1, name.length()).toLowerCase() + "!";
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.greet("riley"));
    }
} 