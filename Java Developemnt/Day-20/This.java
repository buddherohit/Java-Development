 
public class This {
    String name;
    int age;
    int num;
    This(String name, int age, int num){
        this.name=name;
        this.age=age;
        this.num=num;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getNum(){
        return num;
    }
    public static void main(String[] args) {
        This t1=new This("Rohit", 0, 578445);
       
        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getNum());
    }
}

