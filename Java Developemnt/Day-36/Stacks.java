import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        System.out.println(s1);
        System.out.println("The top element is: " + s1.peek());
        System.out.println("The popped element is: " + s1.pop());
        System.out.println(s1);
        System.out.println("The top element is: " + s1.peek());
        s1.empty();
        System.out.println(s1);
        System.out.println("The element 10 is at position: " + s1.search(10));

    }
}
