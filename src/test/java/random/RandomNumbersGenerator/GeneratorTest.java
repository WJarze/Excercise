package random.RandomNumbersGenerator;

import java.util.Random;
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

}