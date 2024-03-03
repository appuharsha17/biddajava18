package javop;

class MyRunnable implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is starting.");
            Thread.sleep(500); // Suspend the thread for 500 milliseconds
            System.out.println(Thread.currentThread().getName() + " is finished.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class threadrunnable {
    public static void main(String[] args) {
        
        Thread ob1 = new Thread(new MyRunnable(), "Thread 1");
        Thread ob2 = new Thread(new MyRunnable(), "Thread 2");
        Thread ob3 = new Thread(new MyRunnable(), "Thread 3");

        ob1.start();
        ob2.start();
        ob3.start();
    }
}
