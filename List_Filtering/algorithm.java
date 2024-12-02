import java.util.List;

class Kata {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(Integer.class::isInstance).toList();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.filterList(List.of(1, 2, "aasf", "1", "123", 123)));
    }
} 