import org.junit.*;
import static org.junit.Assert.*;

import pfc.*;
import pfc.strategy.*;

public class GameTest {
	@Test
	public void testGameConstruct() {
		Strategy s1 = new RockPaperStrat();
		Strategy s2 = new RandomStrat();
		Player p1 = new Player("p1", s1);
		Player p2 = new Player("p2", s2);
		Game g = new Game(p1, p2);
		assertNotNull(g);
	}

	@Test
	public void testGame1() {
		Strategy s1 = new RockStrat();
		Strategy s2 = new RockStrat();
		Player p1 = new Player("p1", s1);
		Player p2 = new Player("p2", s2);
		Game partie = new Game(p1, p2);
		partie.playOneRound();
		assertEquals(p1.getScore(), p2.getScore());
	}

	@Test
	public void testGame2() {
		Strategy s1 = new PaperStrat();
		Strategy s2 = new RockStrat();
		Player p1 = new Player("p1", s1);
		Player p2 = new Player("p2", s2);
		Game partie = new Game(p1, p2);
		partie.playOneRound();
		assertFalse(p2.getScore() > p1.getScore());
		assertSame(partie.play(2).getName(), "p1");
	}

// ---Pour permettre l'exécution des test----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(GameTest.class);
	}

}
