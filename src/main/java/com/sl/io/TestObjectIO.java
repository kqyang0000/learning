package com.sl.io;

import java.io.*;

public class TestObjectIO {
    public static void main(String args[]) throws Exception {
        T t = new T();
        t.k = 8;
        FileOutputStream fos = new FileOutputStream("d:/share/java/io/testobjectio.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(t);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("d:/share/java/io/testobjectio.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        T tReaded = (T) ois.readObject();
        System.out.println(tReaded.i + " " + tReaded.j + " " + tReaded.d + " " + tReaded.k);

    }
}

/**
 * serializable 标记性接口,表示当前对象可以被序列化
 */
class T implements Serializable {
    int i = 10;
    int j = 9;
    double d = 2.3;
    /**
     * 英文意思透明的，在对象序列化时忽略被修饰的值
     */
    transient int k = 15;
}