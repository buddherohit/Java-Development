import java.util.Scanner;
class Employee {
    int id; // attributes or properties of class
    String name;
    float salary;
    int registration;
    public void EmployeDetails() {
        System.out.println("My id is" + id);
        System.out.println("And my name is" + name);
       
    }

}
public class OOS {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Employee emp = new Employee(); // object of employee class
        // System.out.println("Enter your id");
        System.out.println("The details is");
        Employee m1=new Employee();
        emp.id = 45;
        // System.out.println("Enter your name");
        emp.name = "Rohit";
        // System.out.println("Enter your sallary");
        emp.salary = 45786878;
        emp.registration = 546589;
        m1.name = "Manish";
        m1.salary = 457988;
        m1.id=07;
        emp.EmployeDetails();
        System.out.println(m1.id);
        System.out.println(m1.name);
        System.out.println(m1.salary);
    }

}
