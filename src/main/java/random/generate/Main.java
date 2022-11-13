package random.generate;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random (2);
        for (int i = 1; i <10; i++){
            double randDouble = random.nextDouble(1);
            int randInt = random.nextInt (i);
            System.out.println ( randDouble );
            System.out.println (randInt );
        }
    }
}
