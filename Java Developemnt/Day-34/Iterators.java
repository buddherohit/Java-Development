import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add(0, "Java");
        list.add("C++");
        list.add("JavaScript");
        list.add("Typescript");
        list.add("Go");
        list.add("Rust");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
