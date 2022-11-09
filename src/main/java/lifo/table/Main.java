package lifo.table;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack ( 5 );

        stack.add ( 1 );
        stack.add ( 2 );
        stack.add ( 3 );
        stack.add ( 4 );
        stack.display ();
        System.out.println ("added to stack" );

        stack.pop ();
        stack.display ();
        stack.pop ();
        stack.display ();
        stack.pop ();
        stack.display ();
        System.out.println ("removed to stack" );

        stack.add ( 2 );
        stack.add ( 3 );
        stack.add ( 4 );
        stack.display ();
        System.out.println ("added to stack" );
        stack.clear ();
        stack.display ();
        System.out.println ("clear stack" );

    }
}
