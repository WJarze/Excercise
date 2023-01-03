package collection.linkedList.iterator;

import java.util.Iterator;
import java.util.List;

public class UserList {
    User user;
    List<User> users;

    Iterator<User> iterator;

    public UserList(List<User> users) {
        this.users = users;
    }

    void add(User user){
        if(user instanceof User)
        users.add(user);
    }

    void iterator(List<User> users){
        for (Iterator<User> iterator = users.iterator ( ); iterator.hasNext ( );){
            System.out.println (iterator.next () );
        }
    }
}
