package collection.linkedList.add;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog ( "Mastiff" , 65 , 10 );
        Dog dog2 = new Dog ( "BullMastiff" , 58 , 10 );
        Dog dog3 = new Dog ( "York" , 1 , 12 );
        Dog dog4 = new Dog ( "York" , 1 , 12 );
        LinkedList<Dog> dogsData = new LinkedList<> ( );
        Dogs dogs = new Dogs ( dogsData );

        System.out.println ( dogs.isEmpty ( dogsData ) );

        dogs.add ( dog1 );
        dogs.add ( dog2 );

        System.out.println ( dogs );

        System.out.println ( dogs.isEmpty ( dogsData ) );

        dogs.addFirst ( dog3 );

        System.out.println ( dogs );

        dogs.addLast ( dog3 );

        System.out.println ( dogs );
        dogs.replace ( 2 , dog4 );
        System.out.println ( dogs );
    }

}
