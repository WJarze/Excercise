package collection.hashMap.fundamentals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import lombok.ToString;

@ToString
public class Map {
    final static Logger logger = LoggerFactory.getLogger ( Main.class );

    User user;

    public Map(HashMap<Integer, User> hashMap) {
        this.hashMap = hashMap;
    }

    HashMap<Integer, User> hashMap;

    void put(int i, User user) {
        for ( i = 0; i < 20 ; i++) {
            hashMap.put ( i,user);
        }
    }
    HashMap<Integer, User> create(int i ){
        for (int j = 0; j < i ; j++) {
            user = new User ( j , ( "Wojtek" + j ) );
            put ( j, user);
            //System.out.println (user );
            //logger.info ( String.valueOf ( user ) );
        }
        return hashMap;
    }
    void show(HashMap<Integer, User> hashMap){
        for (User name:hashMap.values ()) {
            System.out.println (name );
        }
    }
}
