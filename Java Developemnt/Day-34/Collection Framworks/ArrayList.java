public class ArrayList {
    public static void main(String[] args) {
       java.util.ArrayList<Integer> l1=new java.util.ArrayList<>();
       java.util.ArrayList<Integer> l2=new java.util.ArrayList<>();
       l2.add(100);
       l2.add(200);
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(10);
        System.out.println(l1.get(1));
        System.out.println(l1.size());
        System.out.println(l1.remove(1));
        System.out.println(l1.addAll(l2));
       
        System.out.println(l1);
        l1.clear();
        System.out.println(l1);
        System.out.println(l1.contains(100));
        System.out.println("Index of 200 is "+ l1.indexOf(200));
        System.out.println(l1.indexOf(10));
        System.out.println(l1.indexOf(20));
        System.out.println(l1.lastIndexOf(10));


    }
}
