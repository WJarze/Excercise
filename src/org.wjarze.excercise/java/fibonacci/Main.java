package fibonacci;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci ( );
        Check check = new Check ( );

        int n = 50;
        for (int i = 0; i < n; i++) {
            long startTime = System.nanoTime ( );
            System.out.println ( "String element " + fibonacci.calculate ( i ) );
            long endTime = System.nanoTime ( );
            System.out.println ( " time to end calculate " + (endTime - startTime) );
        }
        for (int i = 1; i <= 10; i++)
            System.out.println ( check.isFibonacci ( i ) ? i + " is a Fibonacci Number" :
                    i + " is a not Fibonacci Number" );
    }
}
