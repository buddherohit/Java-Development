import java.util.*;
public class PriorittQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p1=new PriorityQueue<>();
        p1.add(10);
        p1.add(20);
        p1.add(30);
        p1.add(40);
        System.out.println(p1);
        System.out.println("The head element is: " + p1.peek());
        System.out.println("The removed element is: " + p1.remove());
        System.out.println(p1);
        p1.offer(50);
        System.out.println(p1);
        
    }
}
