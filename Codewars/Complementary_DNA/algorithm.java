import java.util.stream.Collectors;

class Kata { 
    public static String makeComplement(String dna) {
        return dna.chars().mapToObj(i -> String.valueOf((char) i))
                  .map(c -> c.equals("A") ? "X" : c)
                  .map(c -> c.equals("G") ? "Y" : c)
                  .map(c -> c.equals("T") ? "A" : c)
                  .map(c -> c.equals("C") ? "G" : c)
                  .map(c -> c.equals("X") ? "T" : c)
                  .map(c -> c.equals("Y") ? "C" : c)
                  .collect(Collectors.joining(""));
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.makeComplement("AAAA"));
        System.out.println(Kata.makeComplement("ATTGC"));
        System.out.println(Kata.makeComplement("GTAT"));
    }
}