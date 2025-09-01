
class MyThread extends Thread {

    volatile boolean running = true;

    public void run() {
        System.out.println("Thread started...");
        while (running) {
        }
        System.out.println("Thread stopped!");
    }
}

class VolatileExample {

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(2000); // thread run for 2 seconds

        t.running = false;
        System.out.println("Main thread changed 'running' to false.");
    }
}
