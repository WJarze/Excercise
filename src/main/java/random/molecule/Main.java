package random.molecule;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random ( );
        int numbersMolecule = 1;
        int numbersOfMove = 5;
        Molecule[] molecule = new Molecule[numbersMolecule];
        Molecule[] nextMove = new Molecule[numbersOfMove];
        Molecules molecules = new Molecules (numbersMolecule,numbersOfMove,molecule,nextMove);
        molecules.startPoint ( random );
        molecules.move ( random );
        System.out.println ( molecules);

    }
}
