package random.RandomNumbersGenerator;

import java.util.Random;
import java.util.stream.IntStream;

public class Generator {
    private final Random rand;

    public Generator(Random rand) {
        this.rand = rand;
    }

    public void randomNumbers(NumbersConditions numbersConditions) {
        IntStream.generate ( () -> {
                    return (rand.nextInt ( numbersConditions.getOrigin ( ) , numbersConditions.getBounds ( ) ));
                } )
                .distinct ( )
                .limit ( numbersConditions.getSize ( ) )
                .boxed ( )
                .toList ( )
                .forEach ( System.out::println );
    }
}

