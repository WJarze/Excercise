package io.filesFromSpecifiedFolder;

import java.io.File;
import java.io.FilenameFilter;
public class Main {
    public static void main(String args[]){
        String filePath = "E:\\Nauka\\Programowanie\\Ksiązki programowanie\\java\\Horstmann";
        File file = new File(filePath);
        String[] list = file.list(new FilenameFilter() {

            public boolean accept(File list, String name) {
                if(name.toLowerCase().endsWith(".pdf")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}
