import org.junit.*;
import static org.junit.Assert.*;
import battleship.*;


public class CellTest {

    @Test
    public void testIsEmpty(){
      Cell c = new Cell();
      assertTrue(c.isEmpty());
      Ship s = new Ship(3);
      c.setShip(s);
      assertFalse(c.isEmpty());
    }

    @Test
    public void testSetShip(){
      Cell c = new Cell();
      Ship s = new Ship(3);
      c.setShip(s);
      assertSame(s,c.getShip());
    }


    @Test
    public void testFirstShot(){
      Cell c = new Cell();
      Ship s = new Ship(3);
      c.setShip(s);
      assertEquals(3,s.getLifePoints());
      c.shot();
      assertEquals(2,s.getLifePoints());
    }

    @Test
    public void testSecondShot(){
      Cell c = new Cell();
      Ship s = new Ship(3);
      c.setShip(s);
      assertEquals(3,s.getLifePoints());
      c.shot();
      assertEquals(2,s.getLifePoints());
      c.shot();
      assertEquals(2,s.getLifePoints());
    }

    @Test
    public void testHasBeenShot(){
      Cell c = new Cell();
      Ship s = new Ship(3);
      c.setShip(s);
      assertFalse(c.hasBeenShot());
      c.shot();
      assertTrue(c.hasBeenShot());
    }

    @Test
    public void testGetCharacterShot(){
      Cell c = new Cell();
      Ship s = new Ship(3);
      c.setShip(s);
      c.shot();
      assertEquals("*",c.getCharacter(true));
      assertEquals("*",c.getCharacter(false));
    }

    @Test
    public void testGetCharacterEmpty(){
      Cell c = new Cell();
      assertEquals("~",c.getCharacter(true));
      c.shot();
      assertEquals("~",c.getCharacter(false));
    }

    @Test
    public void testGetCharacterNotEmpty(){
      Cell c = new Cell();
      Ship s = new Ship(3);
      c.setShip(s);
      assertEquals("B",c.getCharacter(true));
      assertEquals(".",c.getCharacter(false));
    }

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(CellTest.class);
    }

}
