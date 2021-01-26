import org.junit.*;
import static org.junit.Assert.*;

import example.util.*;
import example.Robot;

public class RobotTest {
  @Test
  public void testRobottake(){
    Robot R1=new Robot();
    Box B1=new Box(10);
    assertFalse(R1.carryBox());
    R1.take(B1);
    assertTrue(R1.carryBox());
  }
  @Test
  public void testcarryBox(){
    Robot R1=new Robot();
    assertNull( R1.getCarriedBox());
    Box B1=new Box(10);
    R1.take(B1);
    assertNotNull(R1.getCarriedBox());

  }
  @Test
  public void testputOn(){
    Robot R1=new Robot();
    Box B1=new Box(10);
    ConveyerBelt belt=new ConveyerBelt(10);
    assertFalse(R1.carryBox());
    R1.take(B1);
    assertEquals("ok",R1.putOn(belt));
    assertNull(R1.getCarriedBox());

  }




public static junit.framework.Test suite() {
    return new junit.framework.JUnit4TestAdapter(RobotTest.class);
}
}
