package addElementToArrayTest;

import array.addArray.AddElementToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddElementTest {
    private AddElementToArray addElementToArray;

    @BeforeEach
    public void init() {
        addElementToArray = new AddElementToArray ( );
    }

    @Test
    public void shouldReturnOneSizeLarger() {
        // when
        int sizeBefore = addElementToArray.getTab ( ).size ( );
        addElementToArray.add ( 6 );
        int sizeAfter = addElementToArray.getTab ( ).size ( );
        // then
        Assertions.assertEquals ( sizeBefore + 1 , sizeAfter );
    }
}
