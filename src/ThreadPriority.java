public class ThreadPriority {
    public static void main(String[] args) {
        Thread_Priority t1 = new Thread_Priority("Thread1");
        Thread_Priority t2 = new Thread_Priority("Thread2");
        Thread_Priority t3 = new Thread_Priority("Thread3");
        Thread_Priority t4 = new Thread_Priority("Thread4");
        Thread_Priority t5 = new Thread_Priority("Thread5");


        t4.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);







    }
}
class Thread_Priority extends Thread{

    Thread_Priority(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
