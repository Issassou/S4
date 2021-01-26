import org.junit.*;
import static org.junit.Assert.*;

import date.Date;
import date.Month;

public class dateTest{
  @Test
  public void testTommorow(){

    Date d1=new Date(2,Month.avril,2020);
    Date d2=new Date(31,Month.janvier,2020);
    Date d3=new Date(31,Month.decembre,2020);
    assertEquals(new Date(3,Month.avril,2020),d1.tommorow());
    assertEquals(new Date(1,Month.fevrier,2020),d2.tommorow());
    assertEquals(new Date(1,Month.janvier,2021),d3.tommorow());
  }
  @Test
  public void testNdayslaterwhenOk(){
    Date d1=new Date(1,Month.avril,2020);
    assertEquals(new Date(1,Month.mai,2020),d1.nbDayslater(30));
    assertEquals(new Date(1,Month.avril,2021),d1.nbDayslater(365));

  }

  @Test(expected = IllegalArgumentException.class)
  public void testNdayslaterThrowExceptionwhenNbDaysIsNegative(){
      Date d1=new Date(1,Month.avril,2020);
      d1.nbDayslater(-10);

  }











  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(dateTest.class);
  }



}
