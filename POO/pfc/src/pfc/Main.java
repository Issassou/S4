package pfc;

import pfc.strategy.*;
import pfc.io.*;

/**
 * A class to launch the game ,
 *
 */
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		System.out.print(" Veuillez saisir votre nom : ");
		String userName = Input.readString();
		System.out.print(" Veuillez saisir le nombre de tours de la partie : ");
		int numberOfRounds = Input.readInt();
		try {
			Player machine = new Player("La machine", new RandomStrat());
			Player humain = new Player(userName, new KeyBoardStrat());
			// pour la complation
			Player p1 = new Player("toto", new PaperStrat());
			Player p2 = new Player("titi", new RockPaperStrat());
			Player p3 = new Player("tata", new RockStrat());
			Game game = new Game(machine, humain);
			game.play(numberOfRounds);
		} catch (Exception e) {
			// "exception... : input does not correspond to an integer
			// here we choose to provide a default value
			numberOfRounds = 3;
			Player machine = new Player("La machine", new RandomStrat());
			Player humain = new Player(userName, new KeyBoardStrat());
			System.out.println("You entred a wrong value, by default the number of ronds is 3 ");
			Game game = new Game(machine, humain);
			game.play(numberOfRounds);
		}
	}
}
