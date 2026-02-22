
 class Students {
    Students(){
        System.out.println("Student class constructor");
    }
}
class Boys extends Students{
    Boys(){
        super();
        System.out.println("Boys class constrctor");
    }
}
public class Teachers{
    public static void main(String[] args) {
        Boys b1=new Boys();
        
    }
}
