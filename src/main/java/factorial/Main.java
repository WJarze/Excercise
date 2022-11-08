package factorial;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        long startLoop = System.nanoTime ();
        long factorialLoop = calculate.factorialUsingLoop ( 10 );
        long andLoop = System.nanoTime ();
        System.out.println (andLoop - startLoop );
        long startRecursion = System.nanoTime ();
        long factorialRecursion = calculate.factorialUsingRecursion ( 10 );
        long andRecursion = System.nanoTime ();
        System.out.println (andRecursion - startRecursion );
        long startStream = System.nanoTime ();
        long factorialStreams = calculate.factorialUsingStreams ( 10 );
        long andStream = System.nanoTime ();
        System.out.println (andStream - startStream );
        System.out.println (factorialLoop );
        System.out.println (factorialRecursion );
        System.out.println (factorialStreams );

    }
}
