package Threads;

public class Ex2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getId() + " Counter: " + i);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getId() + " Counter: " + i);
            }
        });

        thread1.start();
        thread2.start();
    }
}

