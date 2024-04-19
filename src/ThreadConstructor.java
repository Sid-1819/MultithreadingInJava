public class ThreadConstructor {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread1");

    MyThread3 t2 = new MyThread3();
    Thread a = new Thread(t2);

    t1.start();
    a.start();


    }

}
class MyThread extends Thread{

    public  MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        int i =0;
        while (i<1000) {
            System.out.println("Thread started!");
            i++;
        }

    }
}

class MyThread3 implements Runnable{

    public MyThread3(Runnable r){
        super();

    }
    public void run(){
        int i =0;
        while (i<1000) {
            System.out.println("Hello");
            System.out.println("Nice to meet you!");
            i++;
        }
    }
}