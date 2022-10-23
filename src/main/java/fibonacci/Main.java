package fibonacci;

public class Main {
    public static void main(String[] args) {
int n = 50;
        for (int i = 0; i < n; i++) {
            Fibonacci fibonacci = new Fibonacci ( );
            long startTime = System.nanoTime ( );
            System.out.println ( "String element " + fibonacci.calculate ( i) );
            long endTime = System.nanoTime ( );
            System.out.println (" time to end calculate " + (endTime - startTime) );
        }
    }
}
