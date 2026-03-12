import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> v1= new Vector<>();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.addFirst(5);
        v1.addLast(50);
        v1.add(4,40);
        System.out.println(v1);

    }
}
