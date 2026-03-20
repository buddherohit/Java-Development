import java.util.TreeSet;
public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(3); 
        set.add(8);
        set.add(1);
        System.out.println(set);
        set.add(3);
        System.out.println(set);
        System.out.println(set.contains(5));
        System.out.println(set.contains(10));
        System.out.println(set.first());
        System.out.println(set.last());
        set.remove(3);
        System.out.println(set);

    }
}
