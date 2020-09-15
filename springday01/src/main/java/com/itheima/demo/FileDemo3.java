package com.itheima.demo;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Arrays;

public class FileDemo3 {
    public static void main(String[] args) {
        function4();
    }

    public static void function(){
        File file = new File("G:\\500G的java大家伙\\01.Java基础\\22.IO字符流\\视频\\视频");
        String name = file.getName();
        String path = file.getPath();
        System.out.println(name);
        System.out.println(path);
    }
    public static void function1(){
        File file = new File("G:\\500G的java大家伙\\01.Java基础\\22.IO字符流\\视频\\视频","testFile");
        long length = file.length();
        System.out.println(length);
    }
    public static void function2(){
        File file = new File("G:\\500G的java大家伙\\01.Java基础\\22.IO字符流\\视频\\视频");
        File absoluteFile = file.getAbsoluteFile();
        System.out.println(absoluteFile);
    }
    public static void function3(){
        File file = new File("G:\\500G的java大家伙\\01.Java基础\\22.IO字符流\\视频\\视频");
        String absoluteFile = file.getParent();
        System.out.println(absoluteFile);
        File parentFile = file.getParentFile();
        System.out.println(parentFile.exists());
    }

    public static void function4(){
        File file = new File("G:\\500G的java大家伙\\01.Java基础\\22.IO字符流\\视频\\视频");
        boolean directory = file.isDirectory();
        if(file.exists()){
            System.out.println(directory);
        }
    }

    @Test
    public  void function5(){
        File file = new File("G:\\500G的java大家伙\\01.Java基础\\22.IO字符流\\视频\\视频");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("list长度:"+list.length);
    }

    @Test
    public  void function6(){
        File file = new File("G:\\500G的java大家伙\\01.Java基础\\22.IO字符流\\视频\\视频");
        File[] list = file.listFiles();
        for (File s : list) {
            System.out.println(s.getName());
        }
        System.out.println("list长度:"+list.length);
    }
   @Test
    public  void function7(){
       File[] files = File.listRoots();
       System.out.println(Arrays.toString(files));
   }

   @Test
   public void function8(){
       File file = new File("G:\\500G的java大家伙\\01.Java基础\\22.IO字符流\\视频\\视频");
       File[] files = file.listFiles(new MyFileFilter());
       for (File file1 : files) {
           System.out.println(file1.getName());
       }
   }

}
