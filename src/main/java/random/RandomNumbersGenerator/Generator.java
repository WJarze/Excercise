package random.RandomNumbersGenerator;

import java.util.List;
import java.util.Random;

public class Generator {
    private final Random rand;
    public Generator(Random rand) {
        this.rand = rand;
    }

    public List<Integer> randomNumbers(ConditionsNumbers conditionsNumbers) {
        return rand.ints ( conditionsNumbers.getSize ( )
                        , conditionsNumbers.getOrigin ( )
                        , conditionsNumbers.getBounds ( ) )
                .boxed ( )
                .toList ( );
    }

    void showRandomNumbers(List<Integer> list) {
        for (Integer numbers : list) {
            System.out.println ( numbers );
        }
    }
}
