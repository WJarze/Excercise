package random.molecule;

import java.util.Objects;
import java.util.Random;

public class Molecule {
    private int x;
    private int y;

    public Molecule(int x , int y ) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int moveX( Random rand) {
        return this.x = x + rand.nextInt ( -1,2 );
    }

    public int moveY( Random rand) {
        return this.y = y + rand.nextInt ( -1,2 );
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Molecule molecule) ) return false;
        return getX ( ) == molecule.getX ( ) && getY ( ) == molecule.getY ( );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( getX ( ) , getY ( ) );
    }

    @Override
    public String toString() {
        return "Molecule{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
