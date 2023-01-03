package collection.arrayList.update;

import java.util.ArrayList;
import java.util.List;

public class Users {
    List<User> userList;

    public Users(ArrayList<User> userList) {
        this.userList = userList;
    }

    public void add(User user) {
        if ( user instanceof User ) {
            userList.add ( user );
        } else {
            System.out.println ( "null" );
        }
    }
    public void update(int i, User user) {
        if ( user instanceof User ) {
            userList.set (i, user );
        } else {
            System.out.println ( "null" );
        }
    }

    public List<User> getUserList() {
        return userList;
    }


    @Override
    public String toString() {
        return "Users{" +
                "users=" + userList +
                '}';
    }
}
