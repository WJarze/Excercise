package AddArray;

public class Main {
    public static void main(String[] args) {
        AddElementToArray array = new AddElementToArray ( );
        array.add ( 4 );
        for (double item:array.getTab ()) {
            System.out.println (item );
        }
    }
}
