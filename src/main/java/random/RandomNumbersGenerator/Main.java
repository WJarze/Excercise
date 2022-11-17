package random.RandomNumbersGenerator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ConditionsNumbers conditionsNumbers = new ConditionsNumbers ( 6 , 0 , 49 );
        Random rand = new Random ( );
        Generator generate = new Generator ( rand );
        generate.showRandomNumbers ( generate.randomNumbers ( conditionsNumbers ) );
    }
}
