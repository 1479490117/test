package com.itheima.demo;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File f1=new File("G:\\500G的java大家伙\\01.Java基础\\23.IO字节流-可跳过 工作有需要再看\\视频\\视频\\testFile\\a.txt");
        File f2=new File("G:\\500G的java大家伙\\01.Java基础\\23.IO字节流-可跳过 工作有需要再看\\视频\\视频\\a.txt");
        funcation2(f1,f2);
    }

    public static void funcation(File source,File end) {
        InputStream in=null;
        OutputStream out=null;
        try {
             in = new FileInputStream(source);
             out=new FileOutputStream(end);
             byte[] b= new  byte[1024];
             int len=0;
             while((len=in.read(b))!=-1){
                out.write(b,0,len);
             }
        }catch (IOException e){
            e.printStackTrace();
           new RuntimeException("文件拷贝失败");
        }finally {
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void funcation2(File source,File end){
        Reader fileReader=null;
        Writer fileWriter=null;
        try {
             fileReader = new FileReader(source);
             fileWriter = new FileWriter(end);

            char[] c= new char[1024];
            int len =0;
            while((len = fileReader.read(c))!=-1){
                fileWriter.write(c,0,len);
                fileWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader!=null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
