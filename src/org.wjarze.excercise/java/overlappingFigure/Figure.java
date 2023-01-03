package overlappingFigure;

import java.util.Arrays;

public class Figure {
Point[] point;

    public Figure(Point[] point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if (o == null || !(o instanceof Figure figure) ) return false;
        return Arrays.equals ( point , figure.point );
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode ( point );
    }
}
