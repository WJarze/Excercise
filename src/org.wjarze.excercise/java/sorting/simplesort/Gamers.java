package sorting.simplesort;

import java.util.List;
import java.util.Objects;

public class Gamers {

    List<Gamer> list ;
    Gamer gamer;

    public List<Gamer> getList() {
        return list;
    }

    public void setList(List<Gamer> list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Gamers gamers) ) return false;
        return getList ( ).equals ( gamers.getList ( ) ) && gamer.equals ( gamers.gamer );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( getList ( ) , gamer );
    }

    @Override
    public String toString() {
        return "Gamers{" +
                "list=" + list +
                ", gamer=" + gamer +
                '}';
    }
}
