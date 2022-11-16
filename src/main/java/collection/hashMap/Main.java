package collection.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Random rand = new Random();

        Map<Integer, Integer> nums = new HashMap<>();
        for (int i = 0; i <= 10;i++) {
            int randomInteger = rand.nextInt ( 0,11 );
            nums.put ( i , randomInteger );
        }

        for (Integer num:nums.values ()) {
            Integer frequency = nums.get ( num );
            nums.put ( num, frequency==null ? 1 : frequency+1 );
            System.out.println (num );
        }
        logger.info ( nums.toString ( ) );

    }
}