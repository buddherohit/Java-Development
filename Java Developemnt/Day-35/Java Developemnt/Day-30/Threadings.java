class MyThread extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Thred 1 is running for cooking");
            System.out.println("foods are created in process");
            i++;
        }
    }
} 
class Mythred2 extends Thread{
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("Thred 2 is running cook are chat with her");
            System.out.println("process are waiting");
            i++;
        }
    }
}
public class Threadings {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        Mythred2 t2=new Mythred2();
        t1.start();
        t2.start();
    }
}
