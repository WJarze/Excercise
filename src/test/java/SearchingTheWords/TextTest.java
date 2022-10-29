package SearchingTheWords;

import org.junit.Assert;
import org.junit.Test;
 
public class TextTest {

 
    @Test
    public void testSearch() { 
        // when
        Text text = new Text ( );
        String txt = "Java is the beast language in the world";
        String search = "language";
        //Given
        Boolean invokeResult = text.search(txt, search);
        // then
        Assert.assertTrue(invokeResult);
    }
}