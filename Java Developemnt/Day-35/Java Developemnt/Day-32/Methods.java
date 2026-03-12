class MyThread extends Thread{
    public void run(){
        for(int i=0; i<999; i++){
            System.out.println("The thread 1 is Running");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0; i<999; i++){
            System.out.println("The thread 2 is Running");
            i++;
        }
    }
}
public class Methods {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread2 t2=new MyThread2();
        t1.start();
        try {
            t1.sleep(500);
        } catch (Exception e) {
            // TODO: handle exception
        }
       
        t2.start();
        t1.isAlive();
        try {
            t1.wait(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
