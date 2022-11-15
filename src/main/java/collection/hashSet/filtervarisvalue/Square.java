package collection.hashSet.filtervarisvalue;

import java.util.Objects;
import lombok.ToString;

@ToString
public class Square {
    private  double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Square square) ) return false;
        return Double.compare ( square.side , side ) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash ( side );
    }
}
