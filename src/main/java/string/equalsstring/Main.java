package string.equalsstring;

public class Main {
    public static void main(String[] args) {
        String s1 = "mammamiia";
        String s2 = "java";

        System.out.println ( s1.equals ( s2 ) );

        String[] words = s1.split ( "" );

        for (String word : words) {
            System.out.println ( word );
            System.out.println ( );
        }
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String w = words[ i ];
            for (int j = 0; j < words.length; j++) {
                if ( w.equals ( words[ j ] ) && words[ i ] != (words[ j ]) ) {
                    count++;
                }
            }
        }
        System.out.println ( count );
        System.out.println ( words[ 0 ].equals ( words[ 0 ] ) );
    }
}
