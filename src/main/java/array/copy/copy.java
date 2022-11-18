package array.copy;

public class copy {
    public static void main(String[] args) {
        int[] tab1 = new int[5];
        for (int i = 0; i < 5; i++){
            tab1[i] =i;
            System.out.println (tab1[i] );
        }
        int[] tab2 = tab1.clone ( );
        for (int i = 0; i < 5; i++){
            tab2[i] =i;
            System.out.println (tab1[i] );
        }
    }
}
