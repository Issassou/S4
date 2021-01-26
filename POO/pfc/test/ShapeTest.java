import org.junit.*;
import static org.junit.Assert.*;

import pfc.*;
import pfc.strategy.*;

public class ShapeTest {
	@Test
	public void testcompareShape() {
		Shape a = Shape.ROCK;
		assertTrue(a.CompareShape(Shape.SCISSORS) == 1);
		assertTrue(a.CompareShape(Shape.PAPER) == -1);
		assertTrue(a.CompareShape(Shape.ROCK) == 0);
	}

// ---Pour permettre l'exécution des test----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(ShapeTest.class);
	}

}
