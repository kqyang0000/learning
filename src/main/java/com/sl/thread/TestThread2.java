package com.sl.thread;

/**
 * <p>同一个Runner线程对象可以同时起两个线程</p>
 *
 * @author kqyang
 * @version 1.0
 * @date 2019/1/17 22:28
 */
public class TestThread2 {
    public static void main(String args[]) {
        Runner2 r = new Runner2();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}

class Runner2 implements Runnable {
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("No. " + i);
        }
    }
}
