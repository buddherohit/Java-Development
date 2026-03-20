
public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<Integer, String> map = new java.util.TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println(map);
        try {
            map.put(null, null);
        } catch (NullPointerException e) {
            System.out.println("Null keys are not allowed in TreeMap");
        }

        System.out.println(map);
        map.put(4, "Four");
        System.out.println(map);
        map.put(2, "Two-Two");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(5));
        try {
            System.out.println(map.get(null));
        } catch (NullPointerException e) {
            System.out.println("Null keys are not allowed in TreeMap");
        }

        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());
        map.put(2, "Unkonwn");
        System.out.println(map);
       System.out.println(map.firstKey());
         System.out.println(map.lastKey());
         

    }
}
