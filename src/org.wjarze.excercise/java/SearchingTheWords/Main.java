package SearchingTheWords;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String wordSequence = "Java is the beast language in the world";
        Text text = new Text ();
        boolean bool = text.search ( wordSequence,"in" );
        System.out.println (bool );


        List<String> list = new ArrayList<> ();
        list.add ( "Oxygen");
        list.add ( "Nitrogen");
        list.add ( "Hydrogen");
        list.add ( "Sulphur");
        list.add ( "Helium");

        WordList wordList = new WordList();
        String searchWord = "Oxygen";
        boolean bool1 = wordList.searchList ( list,searchWord );
        System.out.println (bool1 );
    }
}
