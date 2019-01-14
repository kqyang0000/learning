package com.sl.thread;

/**
 * <p>
 * join 合并线程
 * <p>
 * 执行完当前线程再让出主线程执行
 *
 * @author kqyang
 * @version 1.0
 * @date 2019/1/8 13:14
 */
public class TestJoin {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("thread1");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("i am main thread");
        }
    }
}

class MyThread2 extends Thread {
    MyThread2(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i am " + getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
