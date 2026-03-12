import java.util.*;
import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1= new LinkedList<>();
        l1.add(20);
        l1.add(40);
        l1.add(60);
        l1.addFirst(10);
        l1.addLast(100);
        l1.add(2, 30);
        l1.add(4,50);
        System.out.println(l1);
        Collections.reverse(l1);
        System.out.println("The reverse list is"+ l1);

        
    }
}
