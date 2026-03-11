class MyThread extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println( Thread.currentThread().getName()+"Thread is Running");
        }
    }
}
public class ThreadMethods {
   public static void main(String[] args) {
    MyThread t1=new MyThread();
    MyThread t2=new MyThread();
    t1.start();
    try {
        t1.join();
    } catch (Exception e) {
        // TODO: handle exception
    }
    
    t2.start();
   } 
}
