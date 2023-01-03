package array.remoweElementFromArray;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] my_array = {25 , 14 , 56 , 15 , 36 , 56 , 77 , 18 , 29 , 49};
        System.out.println ( "Original Array : " + Arrays.toString ( my_array ) );
        Element element = new Element ( );
        element.remove ( my_array,1 );

    }
}

