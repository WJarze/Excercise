package collection.arrayList.remowe;

import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {
        Engine engine = new Engine ( "diesel" , 1.2 );
        Engine engine1 = new Engine ( "gasoline" , 1 );
        Engine engine2 = new Engine ( "diesel" , 2.7 );

        Car car = new Car ( engine , "Huindai" );
        Car car1 = new Car ( engine1 , "Ford" );
        Car car2 = new Car ( engine2 , "Mazda" );

        Cars cars = new Cars ( new ArrayList<> ( ) );

        cars.add ( car );
        cars.add ( car1 );
        cars.add ( car2 );

        System.out.println ( cars );
        cars.remove ( 1 );

        for (Car elem : cars.getCarList ( )) {
            System.out.println ( elem );
        }

        cars.removeAll (  );

        System.out.println ( cars );

    }
}
