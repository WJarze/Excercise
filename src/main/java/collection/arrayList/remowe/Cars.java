package collection.arrayList.remowe;

import java.util.ArrayList;
import java.util.List;
import lombok.ToString;

@ToString
public class Cars {
    List<Car> carsList;

    public Cars(ArrayList<Car> carsList) {
        this.carsList = carsList;
    }

    public void add(Car car) {
        if ( car instanceof Car ) {
            carsList.add ( car );
        } else {
            System.out.println ( "null" );
        }
    }

    public void remove ( int i  ) {
        carsList.remove ( i );
    }
 public void removeAll ( ) {
        carsList.removeAll ( carsList );
    }

    public List<Car> getCarList() {
        return carsList;
    }

}
