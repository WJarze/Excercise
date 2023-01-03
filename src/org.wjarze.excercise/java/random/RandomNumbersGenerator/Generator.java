package random.RandomNumbersGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Generator {
    private final Random rand;
List<Integer> list = new ArrayList<> ();
    public Generator(Random rand) {
        this.rand = rand;
    }

    List<Integer> randomNumbers(NumbersConditions numbersConditions) {
        list = IntStream.generate ( () -> {
                    return (rand.nextInt ( numbersConditions.getOrigin ( ) , numbersConditions.getBounds ( ) ));
                } )
                .distinct ( )
                .limit ( numbersConditions.getSize ( ) )
                .boxed ( )
                .toList ( );
        return list;
    }

    void show() {
        for (Integer numbers : list) {
            System.out.println ( numbers );
        }
    }
}

