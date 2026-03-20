import java.util.LinkedList;
import java.util.*;
public class DoublyLinkedList{
    public static void main(String[] args) {
        LinkedList<String> l1=new LinkedList<>();
        l1.add("Java");
        l1.add("Python");
        l1.add("C++");
        l1.addFirst("JavaScript");
        l1.addLast("Ruby");
        l1.add(2, "C#");
        System.out.println(l1);
        Collections.reverse(l1);
        System.out.println("The reverse list is"+ l1);
            
    }
}