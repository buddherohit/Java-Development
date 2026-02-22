import java.util.Scanner;
public class Paramiter {
    int id;
    String name;
    float salary;
    int rollno;
    Paramiter(String newname, int newid){
id=newid;
name=newname;
    }
    Paramiter(String name, int id,int rollno){
this.id=id;  // this keywor used to reference the object first id is class defined id and secodn id is paramiter id
this.name=name;
this.rollno=rollno; 
    }

    public static void main(String[] args) {
        Paramiter p1=new Paramiter("Rohit", 45,66 );
        System.out.println(p1.name);
        System.out.println(p1.id);
        System.out.println(p1.rollno);
    }
}
