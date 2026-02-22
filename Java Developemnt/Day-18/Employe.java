
public class Employe {
    float salary;
    int id;
    String name;
   // public float getSalary() {
  //      return salary;
 //   }
  //  public String getName() {
  //      return name;
 /*    }
    public void setName(String name) {
        this.name = name;
    }*/
    public Employe(String surnmae){
      
       salary=5478332;
       id=45;
       name =surnmae;
    }
    public static void main(String args[]){
    Employe emp=new Employe("Buddhe");
   // emp.salary=450000;
   // emp.name="Rohit";
    //emp.getSalary();
   // emp.getName();
    //emp.setName("Rohit Buddhe");
    System.out.println(emp.salary);
    System.out.println(emp.name);
    System.out.println(emp.id);
    

}
}
