
public class ConstruOverload {
    int age;
    String name;
    ConstruOverload(int age){
        this.age=age;
        
    }
    ConstruOverload(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        ConstruOverload c2=new ConstruOverload(21  );
        System.out.println(c2.age);
        System.out.println(c2.name);
    }
}
