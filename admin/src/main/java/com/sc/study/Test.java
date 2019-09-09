package com.sc.study;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        test test = new test();
        Thread thread1 = new Thread(test);
        thread1.setName("a");
        thread1.start();
        Thread thread2 = new Thread(test);
        thread2.setName("b");
        thread1.join();
        thread2.start();
    }
}
class test implements Runnable{

    @Override
    public void run() {
        System.out.println("A"+Thread.currentThread().getName());
    }
}
