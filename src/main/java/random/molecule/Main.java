package random.molecule;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random ( );
        Molecule[] molecules = new Molecule[ 2 ];

        for (int i = 0; i < molecules.length; i++) {
            int x = random.nextInt ( -5 , 6 );
            int y = random.nextInt ( -5 , 6 );
            molecules[ i ] = new Molecule ( x , y );
        }

        for (int i = 0; i < molecules.length; i++) {
            for (int j = 0; j < 5; j++) {
                molecules[ i ].moveX ( random );
                molecules[ i ].moveY ( random );
                System.out.println ( molecules[ i ] );
                System.out.println ( );
            }
        }

    }
}
