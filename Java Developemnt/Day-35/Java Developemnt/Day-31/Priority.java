class MyThread extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + "is Running") ;
        }
    }
}
public class Priority{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();


    }
}