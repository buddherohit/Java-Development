class MyThread extends Thread {
    MyThread(String name){
        super(name);
    }
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("The thread is Running");
        }
    }
}
class MyThread2 implements Runnable{
    MyThread2(String name){
       
    }
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("The thread is Running");
        }
    }
}
public class ThreadsConst {
    public static void main(String[] args) {
        MyThread t=new MyThread("Rohit");
        MyThread t2 =new MyThread("Manish");
        t.start();
        System.out.println("The name of the thread is " + t.getName());
        System.out.println("The id of the thread is " + t.getId());
        System.out.println("The state of the thread is " + t.getState());
        System.out.println("The priority of the thread is " + t.getPriority());
        System.out.println("The thread is alive " + t.isAlive());
        t2.start();
        System.out.println("The name of the thread is " + t2.getName());
        System.out.println("The id of the thread is " + t2.getId());
        System.out.println("The state of the thread is " + t2.getState());
        System.out.println("The priority of the thread is " + t2.getPriority());
        System.out.println("The thread is alive " + t2.isAlive());
        MyThread2 t3 = new MyThread2("Yogu");
        Thread t4 = new Thread(t3);
        t4.start(); 
        System.out.println("The name of the thread is " + t4.getName());
        System.out.println("The id of the thread is " + t4.getId());
        System.out.println("The state of the thread is " + t4.getState());
        System.out.println("The priority of the thread is " + t4.getPriority());
        
    }
}
