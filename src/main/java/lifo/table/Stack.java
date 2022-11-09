package lifo.table;

public class Stack {
    double[] tab;
    int firstIndex;

    public Stack(int maxSize) {
        this.tab = new double[ maxSize ];
        this.firstIndex = 0;
    }

    int maxSize() {
        return tab.length;
    }

    boolean isEmpty() {
        if ( firstIndex == 0 ) return true;
        else return false;
    }

    void add(double element) {
        if ( firstIndex < tab.length ) {
            tab[ firstIndex ] = element;
            firstIndex++;
        }
    }

    double pop() {
        double result = tab[ firstIndex - 1 ];
        firstIndex--;
        return result;
    }

    void clear() {
        for ( int i = firstIndex; i >= 0; i--){
            tab[ i ] = 0;
        }
    }

    void display() {
        for (int i = 0; i < firstIndex; i++) {
            System.out.println ( tab[ i ] );
        }
    }
}
