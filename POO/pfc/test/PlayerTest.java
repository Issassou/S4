import org.junit.*;
import static org.junit.Assert.*;

import pfc.*;
import pfc.strategy.*;

public class PlayerTest {
	@Test
	public void testPlayerConstruct() {
		Strategy s = new PaperStrat();
		Player p = new Player("toto", s);
		assertNotNull(p);
	}

	@Test
	public void testaddPoints() {
		Strategy s = new PaperStrat();
		Player p = new Player("toto", s);
		p.addPoints(5);
		assertEquals(5, p.getScore());
	}

	@Test
	public void testgetScore() {
		Strategy s = new RockStrat();
		Player p = new Player("toto", s);
		p.addPoints(1);
		assertEquals(1, p.getScore());
	}

	@Test
	public void testplay() {
		Strategy s = new PaperStrat();
		Player p = new Player("toto", s);
		p.play();
		assertEquals(Shape.PAPER, p.play());
	}

	@Test
	public void testgetName() {
		Strategy s = new PaperStrat();
		Player p = new Player("toto", s);
		assertSame("toto", p.getName());
	}

	@Test
	public void testsetStrategy() {
		Strategy s = new PaperStrat();
		Strategy s1 = new RockStrat();
		Player p = new Player("toto", s);
		p.setStrategy(s1);
		assertEquals(Shape.ROCK, p.play());

	}

	// ---Pour permettre l'exécution des test----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(PlayerTest.class);
	}

}
