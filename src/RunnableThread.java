public class RunnableThread {
    public static void main(String[] args) {
        MyRunnableThread1 t1 = new MyRunnableThread1();
        Thread a1 = new Thread(t1);
        MyRunnableThread2 t2  = new MyRunnableThread2();
        Thread a2 = new Thread(t2);
        a1.start();
        a2.start();

    }
}

class MyRunnableThread1 implements Runnable{
    @Override
    public void run(){
        int i =0;
        while (i<1000) {
            System.out.println("Hello");
            System.out.println("Nice to meet you!");
            i++;
        }
    }

}

class MyRunnableThread2 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while(i<1000) {
            System.out.println("Bye");
            System.out.println("Never see you again!");
            i++;
        }

    }

}
