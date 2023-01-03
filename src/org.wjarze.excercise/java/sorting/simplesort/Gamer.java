package sorting.simplesort;

import java.util.Objects;
import sorting.sortSing.Sing;

public class Gamer {

    private String name;
    private int score;

    public Gamer(String name , int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Gamer gamer) ) return false;
        return score == gamer.score && name.equals ( gamer.name );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( name , score );
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

}
