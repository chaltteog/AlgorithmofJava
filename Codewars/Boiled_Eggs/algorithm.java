class Kata {
    public static int cookingTime(int eggs){
        int n = eggs / 8;
        return eggs % 8 == 0 ? n * 5 : n * 5 + 5;
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.cookingTime(0));
        System.out.println(Kata.cookingTime(5));
        System.out.println(Kata.cookingTime(10));
    }
} 