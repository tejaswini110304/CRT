class MyThread extends Thread {
    public void run() {
        System.out.println(getName() + " - Running");

        try {
            System.out.println(getName() + " - Sleeping");
            Thread.sleep(2000);  // TIMED_WAITING state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getName() + " - Finished");
    }
}

public class LifeCycle {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        System.out.println("Thread State: " + t1.getState()); // NEW state

        t1.start(); // Moves to RUNNABLE
        System.out.println("Thread State after start(): " + t1.getState()); // RUNNABLE

        try {
            Thread.sleep(1000); // Main thread sleeps
            System.out.println("Thread State during sleep: " + t1.getState()); // TIMED_WAITING

            t1.join(); // Main thread waits for t1 to finish
            System.out.println("The thread completed its all tasks");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread State after completion: " + t1.getState()); // TERMINATED
    }
}
