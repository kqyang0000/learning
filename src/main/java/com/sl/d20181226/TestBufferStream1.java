package com.sl.d20181226;

import java.io.*;
public class TestBufferStream1 {
  public static void main(String[] args) {
    try {
      FileInputStream fis = 
              new FileInputStream("d:\\share\\java\\io\\TestFileInputStream.java");
      BufferedInputStream bis = 
              new BufferedInputStream(fis);
      int c = 0;
      System.out.println(bis.read());
      System.out.println(bis.read());
      bis.mark(100);
      // 13-回车ASCII 10-换行ASCII
      for(int i=0;i<=100 && (c=bis.read())!=-1;i++){
        System.out.print((char)c+" ");
      }
      System.out.println(); 
      bis.reset();
      for(int i=0;i<=100 && (c=bis.read())!=-1;i++){
        System.out.print((char)c+" ");
      }
      bis.close();
    } catch (IOException e) {e.printStackTrace();}
  }
}