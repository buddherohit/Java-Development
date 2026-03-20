
import java.util.*;
public class Deque{
    public static void main(String[] args) {
        java.util.Deque<Integer> q1=new ArrayDeque<>();
        q1.add(50);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        System.out.println(q1);
        q1.addFirst(5);
        q1.addLast(50);
        System.out.println(q1);
        q1.pop();
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
        q1.pollFirst();
        System.out.println(q1);
        q1.pollLast();
        System.out.println(q1);

    }
}