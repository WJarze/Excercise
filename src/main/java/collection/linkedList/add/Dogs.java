package collection.linkedList.add;

import java.util.LinkedList;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Dogs {
    LinkedList<Dog> dogsData;

    public void add(Dog dog) {
        dogsData.add ( dog );
    }

    public void addFirst(Dog dog) {
        dogsData.addFirst ( dog );
    }

    public void addLast(Dog dog) {
        dogsData.addLast ( dog );
    }
    public boolean isEmpty(LinkedList<Dog> dogsData) {
        if(dogsData.size ( ) == 0) return true;
        else return false;
    }
    public void replace(int i, Dog dog) {
        if(dog instanceof Dog){
        dogsData.set (i , dog);}
        else System.out.println ("null" );
    }
}
