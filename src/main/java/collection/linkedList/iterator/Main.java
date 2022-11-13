package collection.linkedList.iterator;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User ( 1 , "Wojtek" );
        User user2 = new User ( 2 , "Adam" );
        User user3 = new User ( 3 , "Ewa" );
        User user4 = new User ( 4 , "Kasia" );
        List<User> usersList = new LinkedList<> ( );

        UserList users = new UserList ( usersList );
        users.add ( user1 );
        users.add ( user2 );
        users.add ( user3 );
        users.add ( user4 );
        users.iterator ( usersList );

    }
}
