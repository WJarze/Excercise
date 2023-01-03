package array.remoweElementFromArray;

import java.util.Arrays;

public class Element {
    // Remove the second element (index->1, value->14) of the array

    public int[] remove(int[] tab , int removeIndex) {
        for (int i = removeIndex; i < tab.length - 1; i++) {
            tab[ i ] = tab[ i + 1 ];
        }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
        System.out.println ( "After removing the second element: " + Arrays.toString ( tab ) );
    return tab;
    }
}
