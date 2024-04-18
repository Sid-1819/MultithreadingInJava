public class BasicThreading {


    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        //.start method is used to start the thread
        // here both the methods inside different classes are running simultaneously
        // Running both t1 and t2 at same time results in faster execution.


    }
}
class MyThread1 extends Thread{

    @Override
    public void run(){
        //run() is an inbuilt function in Thread class
        int i  = 0;
        while(i<2000) {
            System.out.println("Hello");
            System.out.println("Nice to meet you.");
            i++;
        }
    }

}
class MyThread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 2000) {
            System.out.println("Bye");
            System.out.println("Never meet again.");
            i++;
        }
    }

}