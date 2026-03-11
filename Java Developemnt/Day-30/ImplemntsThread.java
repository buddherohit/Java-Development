class MyThread1 implements Runnable{
    public void run(){
       int i=0;
       while (i<10) {
         System.out.println("Thread 1 is running");
            System.out.println("Thread 1 in process");
            i++;
        }
    }
       }
           

class Mythread2 implements Runnable{
    public void run(){
        int i=0;
        while (i<10) {
             System.out.println("Thread 2 is runnign");
            System.out.println("Thread 2 in processs");
            i++;
        }
    }

        }
           
public class ImplemntsThread {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        Thread gun=new Thread(t1);
        Mythread2 t2=new Mythread2();
        Thread gun2=new Thread(t2);
        gun.start();
        gun2.start();
    }
}
