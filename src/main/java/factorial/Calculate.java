package factorial;

import java.util.stream.LongStream;

public class Calculate {


    public long factorialUsingLoop(int n) {
        int fact = 1;
        for (int i = 0; i <= n; i++) {
            if(i == 0){
                fact = 1;
            }else
             fact = i * fact;

        }
        return fact;
    }
    public long factorialUsingRecursion(int n){
        if(n <=1){
            return 1;
        }
        return n * factorialUsingRecursion(n-1);

    }
    public long factorialUsingStreams(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }
}
