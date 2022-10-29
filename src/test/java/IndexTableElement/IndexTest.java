package IndexTableElement;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class IndexTest {


    @Test
    public void testElement() {
        //when
        Index index = new Index ( );

        int[] tab = {1 , 3 , 79 , 12 , 28 , 33};

        //given
        int invokeResult = index.element ( tab , 28);

        // then
        Assertions.assertEquals(4, invokeResult);
    }
}