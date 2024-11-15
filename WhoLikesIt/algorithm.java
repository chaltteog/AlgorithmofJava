class Kata { 
    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return names[0] + " likes this";    
            case 2: return String.format("%s and %s like this", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);              
            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.whoLikesIt());
        System.out.println(Kata.whoLikesIt("Peter"));
        System.out.println(Kata.whoLikesIt("Jacob", "Alex"));
        System.out.println(Kata.whoLikesIt("Max", "John", "Mark"));
        System.out.println(Kata.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}