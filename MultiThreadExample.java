class PrintNumbers extends Thread {
    private int start;
    private int end;

    public PrintNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                // Introducing a short delay to simulate some work
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        // Creating two threads to print numbers from 1 to 5
        PrintNumbers thread1 = new PrintNumbers(1, 5);
        PrintNumbers thread2 = new PrintNumbers(6, 10);

        // Starting both threads
        thread1.start();
        thread2.start();
    }
}
