class Kata {
    public static String makeReadable(int seconds) {
        return String.format("%02d:%02d:%02d",  seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.makeReadable(0));
    }
} 