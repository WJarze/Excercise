package SearchingTheWords;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class WordListTest {


    @Test
    public void testSearchList() {
        // When
        WordList wordList = new WordList ( );

        List<String> searchList = new ArrayList<> ( );
        searchList.add ( "Oxygen" );
        searchList.add ( "Nitrogen" );
        searchList.add ( "Hydrogen" );
        searchList.add ( "Sulphur" );
        searchList.add ( "Helium" );

        String searchWord = "Oxygen";
        //given
        Boolean invokeResult = wordList.searchList ( searchList , searchWord );

        //then
        Assert.assertTrue ( invokeResult );
    }
}