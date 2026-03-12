import java.util.*;

public class Collection {
    public static void main(String[] args) {
        java.util.Collection<String> c=new ArrayList<>();
        c.add("Hello");
        c.add("World");
        c.add("Java");

            System.out.println(c);
            System.out.println("Size of collection is: "+c.size());
            System.out.println(c.contains("World"));
        }
    }

