package collection.arrayList.reapetscharforstring;

public class Main {
    public static void main(String[] args) {
        String word = "mamamiia";
        String[] words = word.split ( "" );
        for (String element:words) {
            System.out.println (element );

        }
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            String firsValue = words[i];
             {
                if ( firsValue.equals ( words[ i ] )  ) {
                    count++;
                    System.out.println ( firsValue.equals ( words[ i ] ));
                }
            }
        }
        System.out.println (count );

    }
}
