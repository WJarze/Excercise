package random.seed;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(41);
        System.out.println (rand.nextInt(100) );
    }
}
