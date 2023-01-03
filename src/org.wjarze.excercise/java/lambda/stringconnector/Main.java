package lambda.stringconnector;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger log = Logger.getLogger ( Main.class.getName ( ) );
        StringConnector stringConnector  = ( firstString ,  secondString ,  separator) -> firstString.concat ( separator ).concat ( secondString );

        String firstString = "Wojtek";
        String secondString = "Jarze";
        String separator = " ";

        stringConnector.concat ( firstString, secondString, separator);

        log.info (  stringConnector.concat ( firstString, secondString, separator));

    }
}
