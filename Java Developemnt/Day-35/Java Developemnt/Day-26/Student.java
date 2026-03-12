public class Student {
    String name;
    int rollNo;
    String grade;
    public void display(String name , int rollNo, String grade){
        this.name=name;
        this.rollNo=rollNo;
        this.grade=grade;
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Grade: "+grade);

    }
    public static void main(String args[]){
        Student s1=new Student();
        s1.display("Rohit",45,  "A+");
    }
}
