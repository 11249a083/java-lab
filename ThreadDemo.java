class mythread extends Thread {

    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Thread is running: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class threaddemo {

    public static void main(String[] args) {

        mythread t = new mythread();

        t.start();

        System.out.println("Main thread is running");
    }
}
