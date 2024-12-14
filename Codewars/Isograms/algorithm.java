class Kata { 
    public static boolean isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.isIsogram("moOse"));
        System.out.println(Kata.isIsogram("Dermatoglyphics"));
        System.out.println(Kata.isIsogram("aba"));
    }
}