package factorial;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        long factorialLoop = calculate.factorialUsingLoop ( 10 );
        long factorialRecursion = calculate.factorialUsingRecursion ( 10 );
        long factorialStreams = calculate.factorialUsingStreams ( 10 );
        System.out.println (factorialLoop );
        System.out.println (factorialRecursion );
        System.out.println (factorialStreams );

    }
}
