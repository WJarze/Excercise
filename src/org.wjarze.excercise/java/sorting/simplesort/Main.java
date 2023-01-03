package sorting.simplesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    protected static final Logger log = Logger.getLogger ( Main.class.getName ( ) );

    public static void main(String[] args) {
        Gamer gamer1 = new Gamer ( "Wojtek" , 4 );
        Gamer gamer2 = new Gamer ( "Adam" , 8 );
        Gamer gamer3 = new Gamer ( "Bartek" , 14 );
        Gamer gamer4 = new Gamer ( "Piotr" , 12 );
        List<Gamer> list = new ArrayList<> ( );
        Gamers gamers = new Gamers ( );
        gamers.setList ( list );
        list.add ( gamer1 );
        list.add ( gamer2 );
        list.add ( gamer3 );
        list.add ( gamer4 );
        for (Gamer gamer : list) {
            log.log ( Level.INFO , gamer.toString ( ) );
        }
        log.log ( Level.INFO , "\n" );
        class nameCompare implements Comparator<Gamer> {

            @Override
            public int compare(Gamer o1 , Gamer o2) {
                return o1.getName ( ).compareTo ( o2.getName ( ) );
            }
        }
        class scoreCompare implements Comparator<Gamer> {

            @Override
            public int compare(Gamer o1 , Gamer o2) {
                return String.valueOf ( o1.getScore ( ) ).compareTo ( String.valueOf ( o2.getScore ( ) ) );
            }
        }
        Collections.sort ( list , new nameCompare ( ) );
        for (Gamer gamer : list) {
            log.log ( Level.INFO , gamer.toString ( ) );
        }
        log.log ( Level.INFO , "\n" );
        Collections.reverse ( list );
        for (Gamer gamer : list) {
            log.log ( Level.INFO , gamer.toString ( ) );
        }
        log.log ( Level.INFO , "\n" );
        Collections.sort ( list , new scoreCompare ( ) );
        for (Gamer gamer : list) {
            log.log ( Level.INFO , gamer.toString ( ) );
        }
        log.log ( Level.INFO , "\n" );
        Collections.reverse ( list );
        for (Gamer gamer : list) {
            log.log ( Level.INFO , gamer.toString ( ) );
        }
    }
}
