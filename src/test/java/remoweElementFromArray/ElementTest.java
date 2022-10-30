package remoweElementFromArray;

import array.remoweElementFromArray.Element;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ElementTest {

    Element element = new Element ( );

    @Test
    public void shouldReturnOneSizeSmaller() {
        // when
        int[] my_array = {25 , 14 , 56 , 15 , 36 , 56 , 77 , 18 , 29 , 49};

        int sizeBefore = my_array.length;
        int[] a = element.remove ( my_array,1 );
        int sizeAfter = a.length;
        // then
        Assertions.assertEquals ( sizeBefore - 1 , sizeAfter );
    }
}