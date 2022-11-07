package collection.arrayList.update;

import java.util.ArrayList;

public class update {
    public static void main(String[] args) {
        User user = new User ( "Wojtek" , "Kowalski",71_07_27_05569L );
        User user1 = new User ( "Adam" , "Zapędowski", 89_05_30_08504L );
        User user2 = new User ( "Helena" , "Biernacka", 90_04_03_98510L );
        Users users = new Users ( new ArrayList<> ( ) );
        users.add ( user );
        users.add ( user1 );
        System.out.println ( users );
        users.update(1,user2);
        for (User elem : users.getUserList ( )) {
            System.out.println ( elem );
        }
    }
}
