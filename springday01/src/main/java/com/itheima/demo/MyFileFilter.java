package com.itheima.demo;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {
    public boolean accept(File pathname) {
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".class");
    }
}
