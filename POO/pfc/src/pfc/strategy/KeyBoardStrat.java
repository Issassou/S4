package pfc.strategy;

import java.util.Random;
import pfc.io.*;
import pfc.*;

public class KeyBoardStrat implements Strategy {

	/**
	 * strategy that allows the user to play from his keyboard 'p'for paper 'r' for
	 * rock 's' for Scissors
	 *
	 * @return the shape (rock,paper,scissors)
	 */
	public Shape chooseShape() {
		Shape res = null;
		try {
			System.out.print(" Choose a Shape by entering the corresponding letter: (P:Paper)(R:Rock)(S:Scissors) ");
			String userString = Input.readString();
			userString = userString.substring(0, 1).toLowerCase();
			if (userString.equals("p"))
				res = Shape.PAPER;

			else if (userString.equals("r"))
				res = Shape.ROCK;

			else if (userString.equals("s"))
				res = Shape.SCISSORS;

		} catch (Exception e) {
			System.out.println("You entred a wrong value, by default we choose the Random Strategy");
			res = new RandomStrat().chooseShape();
		}
		return res;
	}

}
