import java.util.List;

class Kata {
    public static List<String> friend(List<String> x){
        return x.stream().filter(people -> people.length() == 4).toList();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.friend(List.of("Ryan", "Kieran", "Jason", "Yous")));
        System.out.println(Kata.friend(List.of("Peter", "Stephen", "Joe")));
    }
}