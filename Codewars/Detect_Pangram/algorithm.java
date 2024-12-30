class Kata {
    public static boolean check(String sentence){
        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.check("The quick brown fox jumps over the lazy dog."));
        System.out.println(Kata.check("You shall not pass!"));
    }
}