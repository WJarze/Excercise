package stream.averange;

import java.util.List;

public class Average {

    double calculate1(List<Integer> list) {
        return list.stream ( )
                .mapToDouble ( a -> a )
                .average ( )
                .getAsDouble ();
    }
}
