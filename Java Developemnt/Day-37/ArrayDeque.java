import java.util.*;
public class ArrayDeque {
    public static void main(String[] args) {
       java.util. ArrayDeque<String> n1=new java.util.ArrayDeque<>();
n1.add("Java");
n1.add("Python");
n1.add("C++");
n1.add("JavaScript");
System.out.println(n1);
n1.addFirst("C#");
n1.addLast("Ruby");
System.out.println(n1);
n1.pop();
System.out.println(n1);
n1.poll();
System.out.println(n1);
n1.pollFirst();
System.out.println(n1);
n1.pollLast();

System.out.println(n1);


    }
}
