import java.util.*;
import java.util.LinkedList;
public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(20);

        q1.add(30);
        q1.add(40);
        System.out.println(q1);
        System.out.println("The head element is: " + q1.peek());
        System.out.println("The removed element is: " + q1.remove());
        System.out.println(q1);
        System.out.println("Remove the element");
        q1.poll();
        System.out.println(q1);
        q1.size();
        System.out.println("The size of the queue is: " + q1.size());
        q1.clear();
        System.out.println(q1);

    }
}
