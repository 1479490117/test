package com.itheima.demo;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        funcation(new File("G:\\500G的java大家伙\\01.Java基础\\23.IO字节流-可跳过 工作有需要再看\\视频\\视频\\testFile\\a.txt"));
    }
    public static void funcation(File file) throws IOException {
        FileInputStream in = new FileInputStream(file);
        byte[] b= new byte[2];
        in.read(b);
        System.out.println(new String(b));

        in.read(b);
        System.out.println(new String(b));

        in.read(b);
        System.out.println(new String(b));


    }
}
