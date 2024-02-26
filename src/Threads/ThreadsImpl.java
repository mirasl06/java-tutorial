package Threads;

import oop.Main;

public class ThreadsImpl implements Runnable {
    public static void main(String[] args) {
        ThreadsImpl obj = new ThreadsImpl();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("Threads Implements");
    }

    public void run() {
        System.out.println("Threads Implements");
    }
}
