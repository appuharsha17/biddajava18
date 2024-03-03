package javop;

class MyThread extends Thread {
    MyThread() {
        super(); // Calling the base class constructor
        start(); // Starting the thread
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500); // Suspend the thread for 500 milliseconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class mainthread {
    public static void main(String[] args) {
        new MyThread(); // Creating an instance of MyThread

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main thread: " + i);
                Thread.sleep(500); // Suspend the main thread for 500 milliseconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}