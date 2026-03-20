import java.util.HashMap;
public class Hashing {
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"Rohit");
        map.put(2,"Yogu");
        map.put(3, "Monu");
        map.put(4,"Rohit");
        System.out.println(map);
        map.put(1,"Rohit Sharma");
        System.out.println(map);
        map.put(5,"Rohit");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(6));
    }
}
