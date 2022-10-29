package IndexTableElement;

public class Index {
    public int element(int[] tab , int matches) {
        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if ( tab[ i ] == matches ) {
               break;
            }
            count++;
        }
        System.out.println (count );
        return count;
    }

}
