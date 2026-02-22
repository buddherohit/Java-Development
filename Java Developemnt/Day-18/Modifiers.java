public class Modifiers {
    private int id;
    private String name;
    public int  getid(){
        return id;
    }
    public String  getname(){
        return name;
    }
    public void setName(String n){
        name =n;
    }
    public void setId(int i) {
        id=i;
    }
    public static void main(String[] args) {
        Modifiers m1=new Modifiers();
        m1.setId(45);
        m1.setName("Rohit");
        System.out.println(m1.getid());
       System.out.println(m1.getname());
    }
    
}
