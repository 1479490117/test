package com.itheima.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        funcation(new File("G:\\500G的java大家伙\\01.Java基础\\23.IO字节流-可跳过 工作有需要再看\\视频\\视频\\testFile\\a.txt"));
    }

    public static void funcation(File file) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write("王榆杰".getBytes());
        outputStream.write("\r\n".getBytes());
        outputStream.write(48);
        outputStream.write(48);
        outputStream.close();
    }
}
