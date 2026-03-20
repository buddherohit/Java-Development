
 class Overridings {
    public void show(){
        System.out.println("I am show of parent class");
    }
}
class A extends Overridings{
    @Override
    public void show(){
        System.out.println("I am show of class A");
    }
}
 class Showing{
    public static void main(String[] args) {
        A a=new A();
        a.show();
    }
}
