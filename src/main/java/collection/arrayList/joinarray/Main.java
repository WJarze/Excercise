package collection.arrayList.joinarray;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<String> array1 = new ArrayList<> (  );
        array1.add( "java");
        array1.add( "is");
        array1.add( "the");
        array1.add( "best");
        ArrayList<String> array2 = new ArrayList<> (  );
        array2.add( "in");
        array2.add( "the");
        array2.add( "world");
        Array array = new Array();
        array.join ( array1,array2);
    }
}
