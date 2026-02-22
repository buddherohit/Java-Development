public class Pollymor {
    public void printName(String name){
        System.out.println(name);
    }
    public void printName(int age){
        System.out.println(age);
    }
    public void printName(String name, int age ){
        System.out.println(name+age);
        
    }
    public static void main(String[] args) {
        Pollymor p1=new Pollymor();
        

        
        p1.printName("Rohit");
        p1.printName(21);
        
        


        
    }
}
