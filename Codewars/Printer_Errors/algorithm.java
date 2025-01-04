class Kata { 
    public static String printerError(String s) {
        return s.chars().mapToLong(c -> c < 110 ? 0 : 1).sum() + "/" + s.length();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.printerError("aaabbbbhaijjjm"));
        System.out.println(Kata.printerError("aaaxbbbbyyhwawiwjjjwwm"));
    }
}