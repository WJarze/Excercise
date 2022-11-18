package random.RandomNumbersGenerator;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class GeneratorTest {


    @Test
    public void should_Be_A_Six() {
        //When
        NumbersConditions numbersConditions = new NumbersConditions ( 6 , 1 , 49 );
        //Given
        Random rand = new Random ( );
        Generator generate = new Generator ( rand );
        java.util.List<Integer> list = generate.randomNumbers ( numbersConditions );
        //Then
        long count = list.stream ( ).count ( );
        Assert.assertEquals ( 6 , count );
    }

    @Test
    public void should_Be_Not_The_Same_Number() {
        //When
        NumbersConditions numbersConditions = new NumbersConditions ( 6 , 1 , 49 );
        //Given
        Random rand = new Random ( );
        Generator generate = new Generator ( rand );
        java.util.List<Integer> list = generate.randomNumbers ( numbersConditions );
        //Then
        long count = list.stream ( ).count ( );
        Assert.assertEquals ( 6 , count );
    }

    @Test
    public void should_Be_Upper_Origin() {
        //When
        NumbersConditions numbersConditions = new NumbersConditions ( 6 , 1 , 49 );
        //Given
        Random rand = new Random ( );
        Generator generate = new Generator ( rand );
        List<Integer> list = generate.randomNumbers ( numbersConditions );
        //Then
        Stream<Integer> intStream = list.stream ();
        boolean resOrigin = intStream.allMatch ( a -> a >= numbersConditions.getOrigin ( ) );
        System.out.println ( "Does all the elements of the stream matches the predicate? " + resOrigin  );
        Assert.assertTrue ( resOrigin );
    }
 @Test
    public void should_Be_lower_bound() {
        //When
        NumbersConditions numbersConditions = new NumbersConditions ( 6 , 1 , 49 );
        //Given
        Random rand = new Random ( );
        Generator generate = new Generator ( rand );
        List<Integer> list = generate.randomNumbers ( numbersConditions );
        //Then
        Stream<Integer> intStream = list.stream ();
        boolean resBounds = intStream.allMatch ( a -> a <= numbersConditions.getBounds ( ) );
        System.out.println ( "Does all the elements of the stream matches the predicate? " + resBounds );
        Assert.assertTrue ( resBounds );
    }

}