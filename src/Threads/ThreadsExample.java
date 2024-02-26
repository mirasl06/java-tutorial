package Threads;

public class ThreadsExample extends Thread {
    @Override
    public void run() {
        System.out.println("Hi, I'm Thread");
    }

    public static void main(String[] args) {

        ThreadsExample threadsExample = new ThreadsExample();
                threadsExample.start();
    }
}
