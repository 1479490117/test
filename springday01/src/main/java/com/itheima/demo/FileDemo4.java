package com.itheima.demo;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        getAllDri(new File("C://"));
    }

    public static void getAllDri(File file){
        File[] files = file.listFiles();
        int i=0;
        if(files != null) {
            for (File f : files) {
                if(f.isDirectory()){
                    i++;
                    System.out.println(i);
                    getAllDri(f);
                }else{
                    //显示文件
                    //System.out.println(f.getName());
                }
            }
        }

    }

    public static int sum(int n){

        if(n==1){
            return n;
        }
        return n*sum(n-1);
    }
}
