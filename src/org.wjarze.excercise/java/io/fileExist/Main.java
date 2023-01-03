package io.fileExist;


public class Main {
    public static void main(String[] args) {
        MethodFiles methodFiles = new MethodFiles();
        Files files = new Files (  );
        boolean isExist = methodFiles.createObjectFile ( files ).exists ();
        System.out.println (isExist );
    }
}
