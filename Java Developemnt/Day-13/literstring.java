
public class literstring {
    public static void main(String args[]) {
        String name = "Rohit";
        System.out.println(name);
        String name2 = "Rohit"; // literal string name and name 2 both are stored in same memory
                                // location and point to same object
        System.out.println("Length of name2: " + name2.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.equals(name2));
        System.out.println(name.charAt(0));
    }

}
