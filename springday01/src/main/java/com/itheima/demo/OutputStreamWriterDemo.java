package com.itheima.demo;

import java.io.*;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("G:\\500G的java大家伙\\01.Java基础\\24.IO输入流与输出流-可跳过 工作有需要再看\\视频\\视频\\a.txt");
        FileOutputStream out = new FileOutputStream(file);
        OutputStreamWriter writer = new OutputStreamWriter(out, "utf-8");
        writer.write("你好");
        writer.close();
    }
}
