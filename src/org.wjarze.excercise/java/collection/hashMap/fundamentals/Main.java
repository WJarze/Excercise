package collection.hashMap.fundamentals;

import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
    final static Logger logger = LoggerFactory.getLogger ( Main.class );

    public static void main(String[] args) {
        HashMap<Integer, User> users = new HashMap<> ( ) ;
        Map map = new Map ( users);
        map.create ( 20 );
        map.show ( users );
        System.out.println (users );
    }
}
