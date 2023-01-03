package bigdecimial;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.logging.Logger;

public class Main {
    private static final BigDecimal a = new BigDecimal ( 1 );
    private static final BigDecimal b = new BigDecimal ( 2 );
    private static final BigDecimal A = new BigDecimal ( 1 );
    private static final BigDecimal B = new BigDecimal ( 2 );

    public static void main(String[] args) {
        Logger log = Logger.getLogger ( Main.class.getName ( ) );
        Main main = new Main ( );
        MathContext mc = new MathContext ( 4 , RoundingMode.HALF_UP );
        BigDecimal c = a.divide ( a.add ( b ) , 4 , RoundingMode.HALF_UP );
        BigDecimal d = main.b.divide ( main.a.add ( main.b ) , mc );
        BigDecimal e = c.add ( d );
        BigDecimal f = (c.add ( d )).multiply ( new BigDecimal ( 100 ) );
        BigDecimal g = c.multiply ( new BigDecimal ( 100 ) ).add ( d.multiply ( new BigDecimal ( 100 ) ) );
        log.info ( c + " " + d );
        log.info ( c.multiply ( new BigDecimal ( 100 ) ) + " " + d.multiply ( new BigDecimal ( 100 ) ) );
        log.info ( String.valueOf ( e ) );
        log.info ( String.valueOf ( f ) );
        log.info ( String.valueOf ( g ) );
        BigDecimal C = A.divide ( A.add ( B ) , 4 , RoundingMode.HALF_UP );
        BigDecimal D = B.divide ( A.add ( B ) , mc );
        BigDecimal E = C.add ( D );
        BigDecimal F = C.add ( D ).multiply ( new BigDecimal ( 100 ) );
        BigDecimal G = C.multiply ( new BigDecimal ( 100 ) ).add ( D.multiply ( new BigDecimal ( 100 ) ) );
        log.info ( C + " " + D );
        log.info ( C.multiply ( new BigDecimal ( 100 ) ) + " " + D.multiply ( new BigDecimal ( 100 ) ) );
        log.info ( String.valueOf ( E ) );
        log.info ( String.valueOf ( F ) );
        log.info ( String.valueOf ( G ) );
    }
}
