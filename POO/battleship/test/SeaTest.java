import org.junit.*;
import static org.junit.Assert.*;
import battleship.*;
import battleship.util.*;
public class SeaTest {

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testGetCell(){
      Sea s = new Sea(10,10);
      Position p = new Position(12,11);
      s.getCell(p);
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testShootOutsideSea(){
      Sea s = new Sea(10,10);
      Position p = new Position(11,11);
      s.shoot(p);
    }

    @Test
    public void testShootInsideSeaHitted(){
      //Creer un plateau
      Sea s = new Sea(10,10);
      Ship ship = new Ship(2);
      //Y poser un bateau long de 2 cellules
      Position p1 = new Position(4,9);
      Position p2 = new Position(5,9);
      Cell c1= s.getCell(p1);
      Cell c2= s.getCell(p2);
      c1.setShip(ship);
      c2.setShip(ship);
      // tester le cas ou le bateau est touché
      Answer a = s.shoot(p1);
      assertEquals(Answer.HIT,a);
    }

    @Test
    public void testShootInsideSeaMissed(){
      //Creer un plateau
      Sea s = new Sea(10,10);
      Ship ship = new Ship(2);
      //Y poser un bateau long de 2 cellules
      Position p1 = new Position(4,9);
      Position p2 = new Position(5,9);
      Cell c1= s.getCell(p1);
      Cell c2= s.getCell(p2);
      c1.setShip(ship);
      c2.setShip(ship);
      // tester le cas ou le bateau est raté
      // Visé pour une seconde fois au même endroit
      Answer a = s.shoot(p1);
      assertEquals(Answer.HIT,a);
      Answer b = s.shoot(p1);
      assertEquals(Answer.MISSED,b);
      // Quand c'est dans l'eau
      Position p = new Position(4,4);
      Answer c = s.shoot(p);
      assertEquals(Answer.MISSED,c);
    }

    @Test
    public void testShootInsideSeaSunk(){
      //Creer un plateau
      Sea s = new Sea(10,10);
      Ship ship = new Ship(2);
      //Y poser un bateau long de 2 cellules
      Position p1 = new Position(4,9);
      Position p2 = new Position(5,9);
      Cell c1= s.getCell(p1);
      Cell c2= s.getCell(p2);
      c1.setShip(ship);
      c2.setShip(ship);
      // tester le cas ou le bateau est coulé
      Answer a = s.shoot(p1);
      assertEquals(Answer.HIT,a);
      Answer b = s.shoot(p2);
      assertEquals(Answer.SUNK,b);
    }

    @Test (expected = IllegalStateException.class)
    public void testAddShipVerticallyException(){
      Sea s = new Sea(10,10);
      Ship ship = new Ship(4);
      Position p = new Position(8,0);
      s.addShipVertically(ship,p);
    }

    @Test
    public void testAddShipVertically(){
      Sea s = new Sea(10,10);
      Ship ship = new Ship(2);
      Position p = new Position(8,0);
      Position p2 =new Position(9,0);
      s.addShipVertically(ship,p);
      Cell c = s.getCell(p);
      Cell c2= s.getCell(p2);
      assertSame(ship,c.getShip());
      assertSame(ship,c2.getShip());
    }
    @Test (expected = IllegalStateException.class)
    public void testAddShipHorizontallyException(){
      Sea s = new Sea(10,10);
      Ship ship = new Ship(4);
      Position p = new Position(0,8);
      s.addShipHorizontally(ship,p);
    }

    @Test
    public void testAddShipHorizontaly(){
      Sea s = new Sea(10,10);
      Ship ship = new Ship(2);
      Position p = new Position(0,8);
      Position p2 =new Position(0,9);
      s.addShipHorizontally(ship,p);
      Cell c = s.getCell(p);
      Cell c2= s.getCell(p2);
      assertSame(ship,c.getShip());
      assertSame(ship,c2.getShip());
    }

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(SeaTest.class);
    }

}
