package io.fileExist;


public class Main {
    public static void main(String[] args) {
        MethodFiles methodFiles = new MethodFiles();
        Files files = new Files (  );
        boolean bool = methodFiles.isFileExist ( files ).exists ();
        System.out.println (bool );
    }
}
