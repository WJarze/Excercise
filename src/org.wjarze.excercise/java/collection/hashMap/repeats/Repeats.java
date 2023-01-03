package collection.hashMap.repeats;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Repeats {
    List<Integer> input = Arrays.asList ( 6 , 6 , 1 , 5 , 5 , 5 , 5 , 5 , 1 , 5 , 6 , 5 , 8 , 5 );
    Map<Integer, Long> result = input.stream ( )
            .collect ( Collectors.groupingBy ( roll -> roll , Collectors.counting ( ) ) );
    public Long maxValueInMap = (Collections.max ( result.values ( ) ));

    public void show() {
        System.out.println ( result );
    }

    public void getMaxResult() {
        // Iterate through HashMap
        for (
                Map.Entry<Integer, Long> entry :
                result.entrySet ( )) {
            if ( entry.getValue ( ) == maxValueInMap ) {
                // Print the key with max value
                System.out.println ( "max value " + " " + entry.getKey ( ) );
                System.out.println ( "number of repetitions " + " " + entry.getValue ( ) );
            }
        }
    }
}