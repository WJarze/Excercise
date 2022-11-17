package stream.sum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Summation summation = new Summation ( );

        List<Integer> list = List.of ( 1 , 2 , 3 , 4 , 5 , 6 );

        // use stream sum method
        System.out.println ( summation.sum1 ( list ) );
        // use stream reduce method
        System.out.println ( summation.sum2 ( list ) );
        // use stream collect method
        System.out.println ( summation.sum3 ( list ) );
    }
}
