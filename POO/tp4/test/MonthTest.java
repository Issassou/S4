import org.junit.*;
import static org.junit.Assert.*;

import date.Month;

public class MonthTest {

    @Test
    public void testgetNbDays() {
        Month janv = Month.janvier;
        Month apr = Month.avril;
        assertEquals(janv.nbDays(2020),31);
        assertEquals(janv.nbDays(2020),janv.nbDays(2021));
        assertEquals(apr.nbDays(2020),30);
        assertEquals(apr.nbDays(2020),apr.nbDays(2021));


    }

    @Test
    public void testnext() {
        Month mar = Month.mars;
        Month dec = Month.decembre;
        assertEquals(mar.next(),Month.avril);
        assertEquals(dec.next(),Month.janvier);
    }



    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(MonthTest.class);
    }

}
