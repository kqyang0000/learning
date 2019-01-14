package com.sl.thread;

/**
 * <p>
 * yield 让出线程
 *
 * @author kqyang
 * @version 1.0
 * @date 2019/1/8 13:19
 */
public class TestYield {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3("t1");
        MyThread3 t2 = new MyThread3("t2");
        t1.start();
        t2.start();
    }
}

class MyThread3 extends Thread {
    MyThread3(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + ": " + i);
            if (i % 10 == 0) {
                yield();
            }
        }
    }
}
