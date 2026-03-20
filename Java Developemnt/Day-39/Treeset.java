import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> t1=new TreeSet<>();
        t1.add(50);
        t1.add(20); 
        t1.add(30);
        t1.add(40);
        System.out.println(t1);
        System.out.println("The first element is: " + t1.first());
        System.out.println("The last element is: " + t1.last());
        System.out.println("The lower element than 30 is: " + t1.lower(30));
        System.out.println("The higher element than 30 is: " + t1.higher(30));
        System.out.println("The floor element than 30 is: " + t1.floor(30));
        System.out.println("The ceiling element than 30 is: " + t1.ceiling(30));
        

    }
}
