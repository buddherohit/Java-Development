
public class Copy {
    int id;
    String name;
    Copy(Copy c2){
        id=c2.id;
        name=c2.name;
    }
Copy(){

}
    public static void main(String[] args) {
        Copy c1=new Copy();
        c1.name="Rohit";
        c1.id=45;
        Copy c2=new Copy(c1);
        System.out.println(c2.name);
        System.out.println(c1.id);
        
    }
}
