package com.itheima.demo;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        function2();
    }

    public static void function(){
        File file = new File("G:\\500G的java大家伙\\01.Java基础\\22.IO字符流\\视频\\视频");
        boolean exists = file.exists();
        System.out.println(exists);
    }
    public static void function1(){
        File file = new File("G:","500G的java大家伙\\01.Java基础\\22.IO字符流\\视频\\视频");
        System.out.println(file);
    }
    public static void function2(){
        File file1 = new File("");
        File file = new File(file1,"500G的java大家伙\\01.Java基础\\22.IO字符流\\视频\\视频");
        System.out.println(file);
    }
}
