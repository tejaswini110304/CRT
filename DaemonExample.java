class MyDaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName()+" is running...");
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class DaemonExample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); // main
        MyDaemonThread daemonThread = new MyDaemonThread();
        
        daemonThread.setDaemon(true); // Setting it as a daemon thread
        daemonThread.setName("Background thread");
        daemonThread.start();
        
        System.out.println(Thread.currentThread().getName());
       

        System.out.println("Main thread is running...");
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("Main thread is ending... Daemon will stop.");
    }
}
