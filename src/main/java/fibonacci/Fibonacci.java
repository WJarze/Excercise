package fibonacci;

public class Fibonacci {

    public int calculate(int n) {
        if ( n == 1 || n == 2 ) {
            return 1;
        } else if(n <= 0) return 0;
        else return calculate ( n - 1 ) + calculate ( n - 2 );

    }

}
