import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(40);
        l1.add(20);
        l1.add(30);
        l1.add(10);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println("The sorted list is: " + l1);
        Collections.reverse(l1);
        System.out.println("The reversed list is: " + l1);
        Collections.shuffle(l1);
        System.out.println("The shuffled list is: " + l1);
        Collections.swap(l1, 0, 2);
        System.out.println("The list after swapping elements at indices 0 and 2 is: " + l1);
        Collections.rotate(l1, 2);
        System.out.println("The list after rotating elements by 2 positions is: " + l1);
        Collections.fill(l1, 100);
        System.out.println("The list after filling all elements with 100 is: " + l1);
        Collections.replaceAll(l1, 100, 50);
        System.out.println("The list after replacing all occurrences of 100 with 50 is: " + l1);
        Collections.copy(l1, l1);
        System.out.println("The list after copying elements is: " + l1);
        Collections.min(l1);
        System.out.println("The minimum element in the list is: " + Collections.min(l1));
        Collections.max(l1);    
        System.out.println("The maximum element in the list is: " + Collections.max(l1));



    }
}
