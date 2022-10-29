package SearchingTheWords;

import java.util.List;

public class WordList {

    public boolean searchList(List<String> searchList, String searchWord){
            boolean bool = searchList.contains ( searchWord );
            return bool;
        }



}
