import java.util.*;

public class Lists {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> element = new java.util.ArrayList<>();
        element.add(10);
        element.add(20);
        element.add(30);
        element.add(40);
        element.add(50);
        System.out.println(element);
        for(int i=0; i<element.size(); i++){
            System.out.println(element.get(i));
        }
        System.out.println("The array list size is: " + element.size());
        Collections.reverse(element);
        System.out.println("The reverse list is: " + element);
        Collections.sort(element);
        System.out.println("The sorted array is"+ element);
    }
}
