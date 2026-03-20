
public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<Integer, String> map=new java.util.LinkedHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println(map);
        map.put(null, null);
        System.out.println(map);
        map.put(4, "Four");
        System.out.println(map);
        map.put(2, "Two-Two");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(5));
        System.out.println(map.get(null));
       System.out.println(map.keySet());
       System.out.println(map.entrySet());
       System.out.println(map.values());

        map.put(5, "Five");
        System.out.println(map);

    }
}
