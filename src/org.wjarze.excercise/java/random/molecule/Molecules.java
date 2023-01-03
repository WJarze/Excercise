package random.molecule;

import java.util.Arrays;
import java.util.Random;

public class Molecules {
    int numbersMolecule;
    int numbersOfMove ;
    Molecule[] molecules;
    Molecule[] nextMove;

    public Molecules(int numbersMolecule , int numbersOfMove , Molecule[] molecules , Molecule[] nextMove) {
        this.numbersMolecule = numbersMolecule;
        this.numbersOfMove = numbersOfMove;
        this.molecules = molecules;
        this.nextMove = nextMove;
    }


    Molecule[] startPoint(Random random) {
        for (int i = 0; i < molecules.length; i++) {
            int x = random.nextInt ( -5 , 6 );
            int y = random.nextInt ( -5 , 6 );
            molecules[ i ] = new Molecule ( x , y );
        }
        return molecules;
    }


    Molecule[] move(Random random){
        for (int i = 0; i < molecules.length; i++) {
            for (int j = 0; j < numbersOfMove; j++) {
                int x = molecules[ i ].moveX ( random );
                int y = molecules[ i ].moveY ( random );
                molecules[ i ] = new Molecule ( x , y );
                nextMove[j] =  molecules[ i ];
            }
        }
        return nextMove;
    }

    @Override
    public String toString() {
        return "Molecules{" +
                "numbersMolecule=" + numbersMolecule +
                ", numbersOfMove=" + numbersOfMove +
                ", molecules=" + Arrays.toString ( molecules ) +
                ", nextMove=" + Arrays.toString ( nextMove ) +
                '}';
    }
}
