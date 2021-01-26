import org.junit.*;
import static org.junit.Assert.*;
import battleship.Ship;

public class ShipTest {

    @Test
    public void testHitted() {
      Ship ship = new Ship(3);
      assertEquals(3,ship.getLifePoints());
      ship.hitted();
      assertEquals(2,ship.getLifePoints());
    }

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(ShipTest.class);
    }

}
