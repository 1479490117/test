package com.itheima.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        function2();
    }

    public static void function() throws IOException {
        File file = new File("G:\\500G的java大家伙\\01.Java基础\\22.IO字符流\\视频\\视频\\testFile");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }

       public static void function2() {
        File file = new File("G:\\500G的java大家伙\\01.Java基础\\22.IO字符流\\视频\\视频\\testFile","新建文本文档.txt");
        boolean delete = file.delete();
        System.out.println(delete);
    }



}
