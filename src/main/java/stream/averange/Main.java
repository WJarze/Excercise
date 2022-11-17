package stream.averange;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Average average = new Average();

        List<Integer> list = List.of ( 1 , 2 , 3 , 4 , 5 , 6 );
        // use stream average
        System.out.println (average.calculate1 ( list ) );
    }

}
