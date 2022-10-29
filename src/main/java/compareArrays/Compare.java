package compareArrays;

public class Compare {

    int checkMatchesNumber(int[] tab1,int[] tab2){
        int val = 0;
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                val = validate ( tab1 , tab2 , val , i , j );
            }
        }
        System.out.println ("number of matches " + val );
        return val;
    }
     int validate(int[] tab1 , int[] tab2 , int count , int i , int j) {
        if ( tab1[ i ] == tab2[ j ] ) {
            System.out.println ( "Win data.Numbers !!!" );
            System.out.print ( tab1[ i ] + " : " );
            System.out.println ( tab2[ j ] );
            count++;
        }
        return count;
    }

}
