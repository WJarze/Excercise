package copyFile;

public class Main {

    public static void main(String[] args) {
        String PATH_NAME1 ="SingList.txt";
        String PATH_NAME2 ="SingListCopy.txt";
        Copy copy = new Copy ( );
        copy.CopyFile ( PATH_NAME1 , PATH_NAME2 );
    }
}