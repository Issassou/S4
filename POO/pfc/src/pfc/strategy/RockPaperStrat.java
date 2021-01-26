package pfc.strategy;

import pfc.*;

public class RockPaperStrat implements Strategy {

	private Shape s = Shape.ROCK;

	/**
	 * return allways ROCK or PAPER
	 *
	 * @return rock or paper
	 */
	public Shape chooseShape() {
		if (this.s == Shape.ROCK) {
			this.s = Shape.PAPER;
			return this.s;
		} else {
			this.s = Shape.ROCK;
			return this.s;
		}
	}

}
