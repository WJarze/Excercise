package stream.sum;

import java.util.List;
import java.util.stream.Collectors;

public class Summation {

    int sum1(List<Integer> list){
        return list.stream ()
                .mapToInt ( a->a )
                .sum ();
    }

    int sum2(List<Integer> list){
        return list.stream ()
                .reduce ( 0,(a,b)-> a  + b );

    }
    int sum3(List<Integer> list){
        return list.stream()
                .collect( Collectors.summingInt(Integer::intValue));

    }


}
