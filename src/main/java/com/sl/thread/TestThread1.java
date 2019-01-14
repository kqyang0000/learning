package com.sl.thread;

/**
 * <p>
 * 通过实现Runnable 接口实现
 * <p>
 * 能使用接口就不使用Thread 继承
 * <p>
 *
 * @author kqyang
 * @version 1.0
 * @date 2019/1/8 12:40
 */
//public class TestThread1 {
//    public static void main(String args[]) {
//        Runnable r = new Runner1();
//        Thread t = new Thread(r);
//        t.start();
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Main Thread:------" + i);
//        }
//    }
//}
//
//class Runner1 implements Runnable {
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Runner1 :" + i);
//        }
//    }
//
//}

/**
 * <p>通过继承Thread 实现
 *
 * @author kqyang
 * @version 1.0
 * @date 2019/1/8 12:40
 */
public class TestThread1 {
    public static void main(String args[]) {
        Thread r = new Runner1();
        r.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("Main Thread:------" + i);
        }
    }
}

class Runner1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Runner1 :" + i);
        }
    }

}
