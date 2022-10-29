package compareArrays;

public class Main {

    public static void main(String[] args) {
        Compare comparison = new Compare();
        int[] tab1 = {1 , 2 , 3 , 4 , 5 , 6};
        int[] tab2 = {0 , 1 , 2 , 3 , 4 , 5};
        comparison.checkMatchesNumber ( tab1,tab2 );
    }
}
