package SortSing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Jukebox {
    ArrayList<Sing> singList = new ArrayList<> ( );

    public void doIt() {
        downloadSing ( );
        System.out.println ( singList );
        Collections.sort ( singList );
        System.out.println (singList );
        TreeSet<Sing> setSings = new TreeSet<>();
        Collections.sort ( singList );
        setSings.addAll(singList);

        System.out.println(setSings);
    }

    void downloadSing() {
        try {
            File file = new File ( "SingList.txt" );
            BufferedReader reader = new BufferedReader ( new FileReader ( file ) );
            String row ;
            while ((row = reader.readLine ( )) != null) {
                addSing ( row );
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException ( e );
        } catch (IOException e) {
            throw new RuntimeException ( e );
        }
    }

    private void addSing(String row) {
        String[] elements = row.split ( "/" );
        Sing sing = new Sing ( elements[0],elements[ 1 ] ,elements[ 2 ],elements[ 3 ] );
        singList.add ( sing );
    }
    class titleCompare implements Comparator<Sing> {

        @Override
        public int compare(Sing o1 , Sing o2) {
            return o1.getTitle ().compareTo(o2.getTitle ());
        }
    }
    class artistCompare implements Comparator<Sing> {

        @Override
        public int compare(Sing o1 , Sing o2) {
            return o1.getArtist().compareTo(o2.getArtist());
        }
    }
    class ratingCompare implements Comparator<Sing> {

        @Override
        public int compare(Sing o1 , Sing o2) {
            return o1.getRating ().compareTo(o2.getRating ());
        }
    }
    class bmpCompare implements Comparator<Sing> {

        @Override
        public int compare(Sing o1 , Sing o2) {
            return o1.getBmp ().compareTo(o2.getBmp ());
        }
    }
}
