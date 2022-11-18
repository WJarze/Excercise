package random.RandomNumbersGenerator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        NumbersConditions numbersConditions = new NumbersConditions ( 6 , 1 , 49);
        Random rand = new Random ( );
        Generator generate = new Generator ( rand );
        generate.randomNumbers ( numbersConditions );
        generate.show ();
    }
}
