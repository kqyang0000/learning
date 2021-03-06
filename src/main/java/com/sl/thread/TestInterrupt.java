package com.sl.thread;

import java.util.*;

/**
 * <p>
 * sleep 线程睡眠
 *
 * @author kqyang
 * @version 1.0
 * @date 2019/1/8 13:09
 */
public class TestInterrupt {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        // 不是线程结束的最好方法
        thread.interrupt();
    }
}

class MyThread extends Thread {
    boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            System.out.println("===" + new Date() + "===");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // 处理异常时最好不要添加业务代码
                return;
            }
        }
    }
}
/*
public void run() {
    while (true) {
      String temp = new Date().toString();
      String t = temp.substring(11, temp.indexOf('C'));
      t = t.trim();
      String[] time = t.split(":");
      if (time.length == 3) {
        System.out.println(�������ǡ� + time[0] + ���㡱 + 
                  time[1] + "��" + time[2] + "��");
      }
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        return;
      }  
    }
  }
}
*/